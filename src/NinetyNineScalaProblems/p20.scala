package NinetyNineScalaProblems

/**

TASK:
    Remove the Kth element from a list.
    Return the list and the removed element in a Tuple. Elements are numbered from 0.

    Example:

    scala> removeAt(1, List('a, 'b, 'c, 'd))
    res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
  */
object p20 {

  def main(args: Array[String]) {
    println(removeAt(1, List('a, 'b, 'c, 'd)) == (List('a, 'c, 'd),'b))
    println(removeAt(1, List('a, 'b, 'c, 'd)))
  }

  def removeAt[a](i: Int, ls: List[a]): (List[a], a) = {
    (ls.patch(i, Nil, 1), ls(i))
  }

}
