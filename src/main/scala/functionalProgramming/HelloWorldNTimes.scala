package functionalProgramming

/**
  * Created by jleng on 4/19/2017.
  */
class HelloWorldNTimes {
  def main(args: Array[String]) {
    val sc = new java.util.Scanner (System.in);
    var n = sc.nextInt();

    f(n)
  }

  def f(n: Int) = 1 to n  foreach (_ => println("Hello World"))
}
