import java.io.FileReader
import java.io.FileNotFoundException
import java.io.IOException

object ExceptionTest{
  def main(args: Array[String]): Unit = {
    try{
      val f = new FileReader("input.txt")
    }catch {
      case ex:FileNotFoundException =>{
        println("File no found")
      }
      case ex:IOException =>{
        println("IO Exception")
      }
      case _ =>{
        println("Other Exception")
      }
    }finally {
      println("finally block")
    }
  }
}