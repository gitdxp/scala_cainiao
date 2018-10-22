package cainiao

class scala_apply1 {

}
class Foo{

}
object Foo{
  def apply(foo:String) : Foo = new Foo(foo)
}

object Client{
  def main(args: Array[String]): Unit = {
    val arr = new Array[Int](3)
    arr(0) = 0
    arr(1) = 1
    arr(2) = 2
    arr.foreach(x => print(x + " "))
    println()
    val array = Array(1,2,3)
    array.foreach(x => print(x + " "))
  }
}