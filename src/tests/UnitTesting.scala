package tests
import org.scalatest._
import lecture.FirstObject
class UnitTesting extends FunSuite {
  test("i forgot to put a test thing") {
    val zero = 0.0
    val below = 29.0
    val exact = 30.0
    val over = 50.0

    assert(FirstObject.computeShippingCost(zero) == 5.0, zero)
    assert(FirstObject.computeShippingCost(exact) == 5.0, exact)
    assert(FirstObject.computeShippingCost(below) == 5.0, below)
    assert(FirstObject.computeShippingCost(over) == 10.0, over)


  }
}