package functionalProgramming

/**
  * Created by jleng on 4/19/2017.
  * https://www.hackerrank.com/challenges/fp-list-replication
  */
class ListReplication {
  def f(num:Int,arr:List[Int]):List[Int] = arr.map(el => List.fill(num)(el)).flatten

}
