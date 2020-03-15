package lecture

object Algebra {
  def factor(input: Int): List[Int] = {
    var Output: List[Int] = List()
    if (input <= 0) {
    }
    else if(input == 1){
      Output = Output :+ 1
    }

    else{
      var count: Int = 0
      var i: Int = 1
      var newNum: Int = input / i
      while(count < 1 && i <= newNum){
        i += 1
        if (newNum % i == 0){
          count += 1
          Output = Output :+ i
          newNum = newNum / i
          i = 1
          count = 0
        }

        else if(newNum == i){
          count == 2
        }
        else{
          count == 0
        }

      }
        }


    Output


  }
  def main(args: Array[String]): Unit = {
    println(factor(2147343647))
  }
}

