package tests
import org.scalatest._
import lecture.Algebra
class TestFactoring extends FunSuite {
  test("I love labels") {
    val zero = 0
    val neg = -5
    val one = 1
    val prime = 5
    val small = 6
    val four = 4

    assert(Algebra.factor(zero).sorted == List())
    assert(Algebra.factor(neg).sorted == List())
    assert(Algebra.factor(one).sorted == List(1))
    assert(Algebra.factor(prime).sorted == List(5))
    assert(Algebra.factor(small).sorted == List(2,3))
    assert(Algebra.factor(four).sorted == List(2,2))










  }
}