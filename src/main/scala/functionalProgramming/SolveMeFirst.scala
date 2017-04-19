package functionalProgramming

/**
  * Created by jleng on 4/19/2017.
  * https://www.hackerrank.com/challenges/fp-solve-me-first
  */
class SolveMeFirst {


  def main(args: Array[String]) {
    println(io.Source.stdin.getLines().take(2).map(_.toInt).sum)
  }
}
