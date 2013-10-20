package NinetyNineScalaProblems

/**

TASK:
    Extract a given number of randomly selected elements from a list.
    Example:

    scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
    res0: List[Symbol] = List('e, 'd, 'a)

    Hint: Use the solution to problem P20
  */
object p23 {

  def main(args: Array[String]) {
    println(randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h)))
  }

  def randomSelect[a](amount: Int, ls: List[a]): List[a] = {
    if (amount >= ls.size) {
      ls
    } else {
      var tempList = ls
      var resList = List[a]()
      val rnd = new scala.util.Random
      rnd.setSeed(System.currentTimeMillis())
      for (i <- 0 to amount) {
        val rndNum = rnd.nextInt(tempList.size - 1)
        resList = resList :+ tempList(rndNum)
        tempList = tempList.patch(rndNum, Nil, 1)

      }

      resList
    }

  }

}
