package NinetyNineScalaProblems

/**

TASK:

Decode a run-length encoded list.
    Given a run-length code list generated as specified in problem P10, construct its uncompressed version.

    Example:

    scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  */
object p12 {

  def main(args: Array[String]) {
    println(decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))))

  }

  def decode[a](ls: List[(Int, a)]): List[a] = {
    ls.map(l => {
      var newList = List[a]()
      for (i <- 1 to l._1) {
        newList = newList :+ l._2
      }
      newList
    }).flatten

  }


}
