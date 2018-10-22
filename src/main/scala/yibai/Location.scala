import java.io._
import Array._
class Point(val xc: Int, val yc: Int) {
  var x: Int = xc
  var y: Int = yc

  def move(dx: Int, dy: Int) {
    x = x + dx
    y = y + dy
    println ("Point x location : " + x);
    println ("Point y location : " + y);
  }
}

class Location(override val xc: Int, override val yc: Int,
               val zc :Int) extends Point(xc, yc){
  var z: Int = zc

  def move(dx: Int, dy: Int, dz: Int) {
    x = x + dx
    y = y + dy
    z = z + dz
    println ("Point x location : " + x);
    println ("Point y location : " + y);
    println ("Point z location : " + z);
  }
}

object Demo {
  def main1(args: Array[String]) {

    Setfun
  }
  def func1(): Unit ={
    val loc = new Location(10, 20, 15);

    // Move to a new location
    loc.move(15, 19, 57);
    println(apply(layout,20))
    niming
    bibao
    shuzu
    rangList
    concatList
    fillList
    maketable
    reversetable
  }
  def Setfun(): Unit ={
    SetExample1
    Setadd
    Setminmax()
    Setjiaoji
    println(matchTest(3))
    regextest
    fileIO()
    cmdreadline()
    //readfile
  }
  //高阶函数
  def apply(f:Int => String,v:Int) = f(v)

  def layout[A](x:A) = "[" + x.toString + "]"

  //匿名函数
  def niming(): Unit ={
    var inc  = (x:Int) => x+1
    var dec = (x:Int) => x -1
    var dInt = (x:Int) => x*2
    var halfInt = (x:Int) => x/2
    println("inc 5 : " + inc(5))
    println("dec 5: "  + dec(5))
    println("dInt 5 ：" + dInt(5))
    println("halfInt 22:" + halfInt(22))

  }
  //闭包，本身是一个函数 ，但它返回的值取决于在此函数之外声明的一个或多个变量的值
  def bibao(): Unit ={
    var factor = 3
    def  multiInt(i:Int) = i * factor
    println("multi 4 :" + multiInt(4))
    println("multi 3:" + multiInt(3))

  }

  //创建数组
  def shuzu(): Unit ={
      var myList  = Array(2,3,4,5,55,6)
      for(x <- myList)
        println(x)
      //多维数组
      var myMatrix = ofDim[Int](3,3)
      for(i <- 0 to 2)
        for(j <- 0 to 2)
          myMatrix(i)(j) = j;

      for(i <- 0 to 2){
        for(j <- 0 to 2)
          print(myMatrix(i)(j))
        println()
      }
  }
// range 创建数组
  def rangList(): Unit ={
    var list1 = range(10,20)
    var list2 = range(10,20,2)
    for(x <-list1)
      print(x + " ")
    println()
    for(x <- list2)
      print(x + " ")
    println()
  }
  //连接列表
  def concatList(): Unit ={
    var fruit1 = "apple" ::("orange"::("pears"::Nil))
    var fruit2 = "mangoes" ::("banana"::Nil)
    var fruit = fruit1 ::: fruit2
    println("fruit : "  + fruit)

    fruit = fruit1.:::(fruit2)
    fruit = List.concat(fruit1,fruit2)
  }
  //创建 统一列表
  def fillList(): Unit ={
    var fruit = List.fill(3)("apple")
    println("fruit fill : " + fruit)

    val num = List.fill(10)(23)
    println("num: " + num)
  }
  //制表函数 tabulate
  def maketable(): Unit ={
    //你可以使用一个函数与List.tabulate()方法在列表之前应用于列表的所有元素。
    //它的参数与List.fill类似 ，第一个参数列表给出要创建的列表的维度，第二个参数列出了
    //列表的元素。唯一的区别是，它不修复元素，而是从函数中计算
    val squares = List.tabulate(6)(n => n*n)
    println("squares :" + squares)
    val mul = List.tabulate(4,5)(_ * _)
    println("mul :" + mul)
  }
  //反向表顺序
  def reversetable(): Unit ={
    var fruit = "apple"::("orange"::("pear"::Nil))
    println("before reverse fruit:" + fruit)
    println("after reverse fruit:" + fruit.reverse)
  }

  //集合  Set
  def SetExample1(): Unit ={
    var fruit = Set("apple" ,"orange","pears")
    val nums:Set[Int] = Set()
    println("head fo fruit" + fruit.head)
    println("tail of fruit" + fruit.tail)
    println("check if fruti is empty:" + fruit.isEmpty)
    println("check if nums is empty:" + nums.isEmpty)
  }

  def Setadd(): Unit ={
    val fruit1 = Set("apple","orange","pears")
    val fruit2 = Set("mangoes","banana")

    var fruit = fruit1 ++ fruit2
    println("fruit1 + fruit2 :" + fruit)

    fruit = fruit1.++(fruit2)
    println("fruit1.++(fruit2): " + fruit)
  }
  def Setminmax(): Unit ={
    val num = Set(5,6,7,8,2)
    println("min elem in Set is :" + num.min)
    println("max elem in Set is :" + num.max)
  }
  def Setjiaoji(): Unit ={
    val num1 = Set(1,2,3,4,5,6,6,7,8)
    val num2 = Set(3,4,5,6,7,8,9)
    println("num1.&(num2):" + num1.&(num2))
    println("num1.intersect(num2):" + num1.intersect(num2))
  }

  //元组
  def tupleexample(): Unit ={
    val t = (1,"hello","sdssdds" -> 23)
    val t1 = new Tuple3(1,"edkds","dkdk" -> 23)
    println("t1._1 :" + t1._1)
    println("t1._2 :" + t1._2)
  }
  //模式匹配
  def matchTest(x:Any): Any = x match{
      case 1 => "one"
      case "two" =>2
      case y:Int => "scala.Int"
      case _ => "many"
  }
  //正则表达式  regex
  def regextest(): Unit ={
    val pattern = "scala".r
    val str = "scala is scalable and cool"

    println(pattern findFirstIn str)

    println((pattern findAllIn str).mkString(","))
  }
  //文件IO
  def fileIO(): Unit ={
    val writer = new PrintWriter(new File("test.txt"))
    writer.write("hello scala")
    writer.close()
  }
  //从命令行读一行
  def cmdreadline(): Unit ={
    println("please input your input:")
    val br = new BufferedReader(new InputStreamReader(System.in))
    val line  =  br.readLine()
    println("thanks, you just typed:" + line)
  }
  //阅读文件内容
    def readfile(): Unit ={
    println("Following is the content read:")
    //for(line <- Source.fromFile("test.txt").getLines){
    //  println(line)
    //}

  }
}