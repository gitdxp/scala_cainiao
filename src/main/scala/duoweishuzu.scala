import Array._

class duoweishuzu {

}

object Test{
  def main(args: Array[String]): Unit = {
    test2
  }
  // iterator 迭代器不是集合，是一种访问集合的方法
  def test2 = {
    val it = Iterator("Baidu","Google","Taobao")
    println(it.length)
    while(it.hasNext){
      println(it.next())
    }
    println(it.length)
    //println(it.max)
    //println(it.min)
  }

  def test1 = {
    var myMatrix = ofDim[Int](4,2)
    var num:Int = 0
    for(i<- 0 to 3){
      for(j<- 0 to 1){
        myMatrix(i)(j) = num + 1
        num += 1
      }
    }
    for(i<-0 to 3){
      for(j<- 0 to 1){
        print(" " + myMatrix(i)(j))
      }
      println()
    }
  }
}
