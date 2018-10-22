package cainiao

class getset {
  private var ages = 0
  private var names = ""

  def age = ages
  def age_(newAge:Int)={
    ages = newAge
  }
  def name = names
  def name_(newName:String) = {
    names = newName
  }
}

object getset{
  def main(args: Array[String]): Unit = {
    var stu = new getset
    stu.name_("Tom")
    stu.age_(23)
    println("stu.name:" + stu.names + ", stu.age:" + stu.ages)

  }
}
