import scala.util.matching.Regex

class RegixExpression {

}

object RegexTest{
  def main(args: Array[String]): Unit = {
    val pattern = "scalab".r
    val str = "Scala is scalable and cool"
    /*
    实例中使用 String 类的 r() 方法构造了一个Regex对象。
然后使用 findFirstIn 方法找到首个匹配项。
如果需要查看所有的匹配项可以使用 findAllIn 方法。
     */
    println(pattern findFirstIn str)

    val pattern1 = new Regex("(S|s)cala")
    println((pattern1 findAllIn str).mkString(","))
    println(pattern1 replaceAllIn(str,"java"))
    println(str)

  }
}