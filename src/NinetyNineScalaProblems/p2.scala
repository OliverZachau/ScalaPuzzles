package NinetyNineScalaProblems

/**

   TASK:

    Find the last but one element of a list.
    Example:

    scala> penultimate(List(1, 1, 2, 3, 5, 8))
    res0: Int = 5
  */
object p2 {

   def main(args: Array[String]) {
     println(penultimate(List(1, 1, 2, 3, 5, 8)))

   }

   def penultimate(list: List[Int]) : Int = {
     list.dropRight(1).last
   }


 }
