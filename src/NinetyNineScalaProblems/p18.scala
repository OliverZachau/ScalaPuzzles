package NinetyNineScalaProblems

/**

TASK:
  Extract a slice from a list.
    Given two indices, I and K, the slice is the list containing the elements from and including the Ith element up to but not including the Kth element of the original list.
    Start counting the elements with 0.

    Example:

    scala> slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: List[Symbol] = List('d, 'e, 'f, 'g)
  */
object p18 {

  def main(args: Array[String]) {
    println(slice(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) == List('d, 'e, 'f, 'g))
  }

  def slice[a](i: Int, k: Int, ls: List[a]): List[a] = {
    ls.slice(i,k)
  }

}
