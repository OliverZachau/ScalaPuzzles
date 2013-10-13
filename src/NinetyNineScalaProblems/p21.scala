package NinetyNineScalaProblems

/**

TASK:
    Insert an element at a given position into a list.
    Example:

    scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
    res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
  */
object p21 {

  def main(args: Array[String]) {
    println(insertAt('new, 1, List('a, 'b, 'c, 'd)) == List('a, 'new, 'b, 'c, 'd))
    println(insertAt('new, 1, List('a, 'b, 'c, 'd)))
  }

  def insertAt[a](n: a, i: Int, ls: List[a]): List[a] = {
    ls.take(i) ++ List(n) ++ ls.takeRight(ls.size - i)
  }

}
