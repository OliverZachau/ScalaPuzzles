package NinetyNineScalaProblems

/**

TASK:
  Duplicate the elements of a list a given number of times.
    Example:

    scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
    res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  */
object p15 {

  def main(args: Array[String]) {
    println(duplicateN(3, List('a, 'b, 'c, 'c, 'd)))

  }

  def duplicateN[a](times: Int, ls: List[a]): List[a] = {
    ls.flatMap(l => {
      List.fill(times)(l)
    })

  }


}
