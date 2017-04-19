package functionalProgramming

/**
  * Created by jleng on 4/19/2017.
  * https://www.hackerrank.com/challenges/fp-filter-array
  */
class FilterArray {
  def f(delim:Int,arr:List[Int]):List[Int] = arr.filter( _ < delim)
}
