package NinetyNineScalaProblems

/**

TASK:

    Find the number of elements of a list.
    Example:

    scala> length(List(1, 1, 2, 3, 5, 8))
    res0: Int = 6
  */
object p4 {

  def main(args: Array[String]) {
    println(length(List(1, 1, 2, 3, 5, 8)))

  }

  def length(list: List[Int]): Int = {
    list.length
  }


}
