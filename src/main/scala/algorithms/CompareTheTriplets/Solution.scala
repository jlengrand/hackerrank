package algorithms.CompareTheTriplets

/**
  * Created by jll on 3/3/2017.
  */
object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var a0 = sc.nextInt();
    var a1 = sc.nextInt();
    var a2 = sc.nextInt();
    var b0 = sc.nextInt();
    var b1 = sc.nextInt();
    var b2 = sc.nextInt();

    printArray(sumArray(sumArray(compare(a0, b0), compare(a1, b1)), compare(a2, b2)))
  }

  def sumArray(a: Array[Int], b: Array[Int]) =
    a.zip(b).map { case (x, y) => x + y }

  def compare(a: Int, b: Int): Array[Int] =
      if(a > b) Array(1, 0)
      else if(b > a) Array(0, 1)
      else Array(0, 0)

  def printArray(ar: Array[Int]) =
    print(ar(0) + " " + ar(1))
}
