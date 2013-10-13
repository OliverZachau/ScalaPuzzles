package NinetyNineScalaProblems

/**

TASK:

Run-length encoding of a list.
    Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.

    Example:

    scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  */
object p10 {

  def main(args: Array[String]) {
    println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

  }

  def encode[A](ls: List[A]) : List[(Int, A)] = {
    pack(ls).map(l => {
      (l.size, l.head)
    })
  }

  def pack[A](ls: List[A]): List[List[A]] = {
    if (ls.isEmpty) {
      List(List())
    } else {
      val (packed, next) = ls.span({
        _ == ls.head
      })
      if (next == Nil) {
        List(packed)
      } else {
        packed :: pack(next)
      }
    }
  }


}
