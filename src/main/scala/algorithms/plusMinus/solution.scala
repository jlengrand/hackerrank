package algorithms.CompareTheTriplets

object PlusMinus {

  def main(args: Array[String]) {
    var n = scala.io.StdIn.readInt()
    val arr = scala.io.StdIn.readLine().split(" ").map(_.toInt).toList;

    println(arr.filter(v => v > 0).length.toFloat/n)
    println(arr.filter(v => v < 0).length.toFloat/n)
    println(arr.filter(v => v == 0).length.toFloat/n)
  }
}
