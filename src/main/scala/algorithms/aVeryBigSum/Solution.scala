package algorithms

/**
  * Created by jll on 3/26/2017.
  */
object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var arr = new Array[Int](n);
    for(arr_i <- 0 to n-1) {
      arr(arr_i) = sc.nextInt();
    }

    print(sum(arr))
  }

  def sum(arr: Array[Int]) : Long =
    arr.map(x => x.toLong).sum

}