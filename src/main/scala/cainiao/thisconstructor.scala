package cainiao

class thisconstructor {

}
class Person private(val name:String){
  //l加private后，主构造器只能自己使用，new时只能使用辅助构造器
  var age  = 0
  var sex = "female"
  println("main constructor")

  def this(name:String,age:Int){
    this(name)
    this.age = age
    println("auxiliary constructor1")
  }
  def this(name:String,age:Int,sex:String){
    this(name,age)
    this.sex = sex
    println("auxiliary constructor2")
  }
}

object thisconstructor{
  def main(args: Array[String]): Unit = {
    //var person1 = new Person("Tom")
    var person2 = new Person("Mike",12)
    var person3 = new Person("Jerry",13,"male")
  }
}