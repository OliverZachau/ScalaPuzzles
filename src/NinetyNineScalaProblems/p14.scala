package NinetyNineScalaProblems

/**

TASK:
  Duplicate the elements of a list.
    Example:

    scala> duplicate(List('a, 'b, 'c, 'c, 'd))
    res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  */
object p14 {

  def main(args: Array[String]) {
    println(duplicate(List('a, 'b, 'c, 'c, 'd)))

  }

  def duplicate[a](ls: List[a]): List[a] = {
    ls.flatMap(l => {
      List(l, l)
    })

  }


}
