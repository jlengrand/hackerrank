package algorithms.DiagonalDifference

import scala.io._

/**
  * Created by jll on 3/27/2017.
  * Found here : https://codepair.hackerrank.com/paper/X2RXZXPW?b=eyJyb2xlIjoiY2FuZGlkYXRlIiwibmFtZSI6IkFpcmJhbGxtYW4iLCJlbWFpbCI6ImpsZW5ncmFuZEBnbWFpbC5jb20ifQ%3D%3D
  */
class SolutionBest {

    def main(args: Array[String]) = {
      val size = StdIn.readInt()

      var lr: Int = 0
      var rl: Int = 0

      for(i <- 0 to (size - 1)) {
        val rowStr = StdIn.readLine().split(" ")

        lr += Integer.parseInt(rowStr(i))
        rl += Integer.parseInt(rowStr(size - i - 1))
      }

      println(Math.abs(lr - rl))
    }
}
