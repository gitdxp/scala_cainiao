class applyTest {
  def apply() = println("this is class apply")
  def havaTry = {
    println("have a try on apply")
  }
}

object applyTest{
  def apply() = {
    println("this is object apply")
    new applyTest
  }
}

object applyOperation{
  def main(args: Array[String]): Unit = {
    val a = applyTest()
    a.havaTry
    a()
  }
}