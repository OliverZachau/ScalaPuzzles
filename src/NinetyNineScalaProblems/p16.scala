package NinetyNineScalaProblems

/**

TASK:
    Drop every Nth element from a list.
    Example:

    scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  */
object p16 {

  def main(args: Array[String]) {
    println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k))
    println(drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)))
  }

  def drop[a](n: Int, ls: List[a]): List[a] = {
    ls.iterator.sliding(n-1, n).flatten.toList
  }


}
