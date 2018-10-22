package cainiao

class callbyname {

}
object callbyname{
  def time(): Long ={
    println("获得时间，单位为纳秒")
    System.nanoTime
  }
  def main(args: Array[String]): Unit = {
    delayed(time)
  }

  def delayed(t: => Long) {
    println("在delayed方法内")
    println("参数: " + t)
    t
  }
}
