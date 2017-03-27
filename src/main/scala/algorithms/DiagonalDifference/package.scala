package algorithms.DiagonalDifference

/**
  * Created by jll on 3/27/2017.
  */
object Solution {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();
    var a = Array.ofDim[Int](n,n);
    for(a_i <- 0 to n-1) {
      for(a_j <- 0 to n-1){
        a(a_i)(a_j) = sc.nextInt();
      }
    }

    print(Math.abs(sumOfDiag(a, n) - sumOfDiag(mirror(a), n)))
  }

  def sumOfDiag(arr: Array[Array[Int]], dim: Int)= {
    var idx = 0
    var out = 0
    while (idx < dim) {
      out += arr(idx)(idx)
      idx += 1
    }
    out
  }

  def mirror(arr: Array[Array[Int]]) =
    arr.map(x => x.reverse)

}
