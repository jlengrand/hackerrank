package algorithms.Staircase

/**
  * Created by jleng on 4/19/2017.
  * Taken from https://www.hackerrank.com/rest/contests/master/challenges/staircase/hackers/gengmao/download_solution
  */
class solutionBest {
  def main(args: Array[String]) {
    val n = readInt
    for {
      i <- 1 to n
      val s = Array.fill[String](n-i)(" ").mkString + Array.fill[String](i)("#").mkString
    } println(s)
  }

}
