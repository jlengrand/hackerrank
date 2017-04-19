package functionalProgramming

/**
  * Created by jleng on 4/19/2017.
  * https://www.hackerrank.com/challenges/fp-filter-positions-in-a-list
  */
class FilterArrayPositions {
  def f(arr:List[Int]):List[Int] = for( (x, i) <- arr.zipWithIndex if i % 2 != 0) yield x

}
