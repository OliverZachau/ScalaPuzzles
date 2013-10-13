package NinetyNineScalaProblems

/**

TASK:
    Create a list containing all integers within a given range.
    Example:

    scala> range(4, 9)
    res0: List[Int] = List(4, 5, 6, 7, 8, 9)
  */
object p22 {

  def main(args: Array[String]) {
    println(range(4, 9) == List(4, 5, 6, 7, 8, 9))
    println(range(4, 9))
  }

  def range(start: Int, end: Int): List[Int] = {
    (start to end).toList
  }

}
