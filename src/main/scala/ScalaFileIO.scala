/*

 */
import java.io._
import scala.io._

class ScalaFileIO {

}
object ScalaFileIO{
  def main(args: Array[String]): Unit = {
    ReadFile()
  }
  //从文件上读取内容
  def ReadFile() ={
    println("File content is :")
    Source.fromFile("test.txt").foreach{
      print
    }
  }
  //从屏幕上读取用户输入
  def ReadInput() = {
    println("please input:")
    val line = StdIn.readLine()

    println("thank you , you input is :" + line)
  }
//写入文件内容
  def wrtieFile() = {
    val writer = new PrintWriter(new File("test.txt"))

    writer.write("hello scala io")
    writer.close()
  }
}
