package lecture


object FirstObject {

  def computeShippingCost(input: Double) : Double = {
    if(input < 30){
      5.0
    }
    else {
      5 + (input - 30) * 0.25
    }

  }

  def main(args: Array[String]): Unit = {
    println(computeShippingCost(30.00001))
    println(computeShippingCost(32.0))
    println(computeShippingCost(31.0))

  }
}

