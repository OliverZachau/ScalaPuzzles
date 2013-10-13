package NinetyNineScalaProblems

/**

TASK:

    Eliminate consecutive duplicates of list elements.
    If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.

    Example:

    scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e)
  */
object p8 {

  def main(args: Array[String]) {
    println(compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

  }

  def compress[A](list: List[A]): List[A] = {
    list.foldRight(List[A]()) { (head, rest) =>
      if (rest.isEmpty || rest.head != head) head :: rest
      else rest
    }
  }


}
