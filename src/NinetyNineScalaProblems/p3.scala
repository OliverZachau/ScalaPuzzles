package NinetyNineScalaProblems

/**

TASK:

    Find the Kth element of a list.
    By convention, the first element in the list is element 0.

    Example:

    scala> nth(2, List(1, 1, 2, 3, 5, 8))
    res0: Int = 2
  */
object p3 {

  def main(args: Array[String]) {
    println(nth(2, List(1, 1, 2, 3, 5, 8)))

  }

  def nth(posi: Int, list: List[Int]): Int = {
    if (list.size > posi) {
      list(posi)
    } else {
      -1
    }
  }


}
