package NinetyNineScalaProblems

/**

TASK:

    Flatten a nested list structure.
    Example:

    scala> flatten(List(List(1, 1), 2, List(3, List(5, 8))))
    res0: List[Any] = List(1, 1, 2, 3, 5, 8)
  */
object p7 {

  def main(args: Array[String]) {
    println(flatten(List(List(1, 1), 2, List(3, List(5, 8)))))

  }

  def flatten(list: List[Any]): List[Any] = {
    list.flatMap({
      case ms: List[_] => flatten(ms)
      case element => List(element)
    })

  }


}
