package NinetyNineScalaProblems

/**

TASK:
    Generate a random permutation of the elements of a list.
    Hint: Use the solution of problem P23.

    Example:

    scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
    res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
  */
object p25 {

  def main(args: Array[String]) {
    println(randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)))
  }

  def randomPermute[A](list: List[A]): List[A] = {

    val permus = list.permutations.zipWithIndex.toList
    val rnd = new scala.util.Random

    permus(rnd.nextInt(permus.size - 1))._1

  }

}
