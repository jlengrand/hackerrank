package algorithms.aVeryBigSum

/**
  * Created by jll on 3/26/2017.
  * From https://codepair.hackerrank.com/paper/PqyQ4XMD?b=eyJyb2xlIjoiY2FuZGlkYXRlIiwibmFtZSI6IkFpcmJhbGxtYW4iLCJlbWFpbCI6ImpsZW5ncmFuZEBnbWFpbC5jb20ifQ%3D%3D
  */
object Solution {

  def main(args: Array[String]) {
    val line = io.Source.stdin.getLines().drop(1)
    println(line.next().split(" ").map(_.toLong).sum)
  }
}