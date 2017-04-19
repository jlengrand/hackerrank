package algorithms.Staircase

object Staircase {

  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();

    createStairs(n).map(n => println(n))
  }

  def createStairs(n: Int): List[String] = {
    def writeStair(p:Int): String = {
      " " * (n - p)  + "#" * p
    }

    def createStair(p: Int, acc: List[String]): List[String] = {
      p match {
        case 0=> acc
        case _ => createStair(p-1, writeStair(p):: acc)
      }
    }
    createStair(n, List())
  }
}
