/*
在我们实例化一个类的时，可以带上0个或者多个的参数，编译器在实例化的时会
调用 apply 方法。我们可以在类和对象中都定义 apply 方法。
就像我们之前提到过的，unapply 用于提取我们指定查找的值，它与 apply 的
操作相反。 当我们在提取器对象中使用 match 语句是，unapply 将自动执行
 */
class extractorcase{
  def apply(): extractorcase = new extractorcase()
}
object extractorcase{
  def main(args: Array[String]): Unit = {
    val x = extractorcase(5)
    println(x)

    x match {
      //case extractorcase(num) =>println(x+51)
      case _ => println("can't calc")
    }
  }
  def apply(x:Int) = x*2
  def unapply() = println("unapply")
}

