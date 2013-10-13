package NinetyNineScalaProblems

/**

TASK:

Modified run-length encoding.
    Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.

    Example:

    scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  */
object p11 {

  def main(args: Array[String]) {
    println(encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)))

  }

  def encode[A](ls: List[A]) : List[Any] = {
    pack(ls).map(l => {
      if(l.size > 1) {
        (l.size, l.head)
      } else {
        l.head
      }

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
