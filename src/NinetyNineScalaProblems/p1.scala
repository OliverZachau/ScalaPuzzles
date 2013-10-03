package NinetyNineScalaProblems

/**

  TASK:

    Find the last element of a list.
    Example:

    scala> last(List(1, 1, 2, 3, 5, 8))
    res0: Int = 8
 */
object p1 {

  def main(args: Array[String]) {
    println(last(List(1, 1, 2, 3, 5, 8)))

  }

  def last(list: List[Int]) : Int = {
    list.last
  }


}
