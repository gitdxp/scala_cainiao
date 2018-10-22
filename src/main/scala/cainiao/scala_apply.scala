package cainiao

/*scala 类中的apply方法
* */
class scala_apply {

}
class Foo(foo:String){

}
object Foo{
  def apply(foo:String):Foo = {
    new Foo(foo)
  }
}

object Client{
  def main(args: Array[String]): Unit = {
    val foo = Foo("foo")

  }
}