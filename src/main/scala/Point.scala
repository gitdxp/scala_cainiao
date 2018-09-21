import java.io._;

class Point(val xc:Int ,val yc:Int) {
  var x:Int = xc
  var y:Int = yc
  def move(dx:Int , dy:Int): Unit ={
    x = x + dx
    y = y + dy
    println("x的坐标点:" +x)
    println("y的坐标点：" + y)
  }

}

class Location(override val xc:Int,override val yc:Int,val zc:Int)
  extends Point(xc,yc){
  var z:Int = zc

  def move(dx:Int,dy:Int,dz:Int): Unit ={
    x = x + dx
    y = y + dy
    z = z + dz
    println("x 的坐标点 : " + x)
    println("y 的坐标点 : " + y)
    println("z 的坐标点 : " + z)
  }
}

object TestLoc{
  def main(args: Array[String]): Unit = {
      val loc = new Location(10,25,15)

      loc.move(10,10,5)
  }
}