package NinetyNineScalaProblems

/**

TASK:
    Lotto: Draw N different random numbers from the set 1..M.
    Example:

    scala> lotto(6, 49)
    res0: List[Int] = List(23, 1, 17, 33, 21, 37)
  */
object p24 {

  def main(args: Array[String]) {
    println(lotto(6, 49))
  }

  def lotto(amount: Int, max: Int): List[Int] = {
    var res = List[Int]()
    var pool = (1 to max).toSet
    val rnd = new scala.util.Random

    rnd.setSeed(System.currentTimeMillis())

    for (i <- 1 to amount) {
      val pick = pool.toList(rnd.nextInt(pool.size - 1))
      res = res :+ pick
      pool = pool.-(pick)
    }
    res
  }

}
