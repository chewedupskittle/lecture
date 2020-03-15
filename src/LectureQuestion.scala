package lecture

import scala.io.{BufferedSource, Source}

object LectureQuestion {

  def fileSum(filename: String): Int = {
    var accum: Int = 0
    val file: BufferedSource = Source.fromFile(filename)
    for (line <- file.getLines()) {
      val splitArr: Array[String] = line.split("#")
      for (number <- splitArr) {
        accum += number.toInt
      }
    }
    accum
  }

  def main(args: Array[String]): Unit = {
    val nam: String = "C:\\Users\\maxfa\\IdeaProjects\\lecture\\Data\\test"
    val num = fileSum(nam)
    println(num)

  }
}
