package NinetyNineScalaProblems

/**

TASK:

    Find out whether a list is a palindrome.
    Example:

    scala> isPalindrome(List(1, 2, 3, 2, 1))
    res0: Boolean = true
  */
object p6 {


  def main(args: Array[String]) {
    println(isPalindrome(List(1, 2, 3, 2, 1)))

  }

  def isPalindrome(list: List[Int]): Boolean = {
    list.reverse == list
  }




}
