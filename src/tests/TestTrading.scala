package tests
import execution.{TradeAgreement, Trader, Valuable}
import org.scalatest._

class TestTrading extends FunSuite {
  test("uh oh stinky") {
    var item1: Valuable = new Valuable()
    var item2: Valuable = new Valuable()
    var Trader1: Trader = new Trader(item1)
    var Trader2: Trader = new Trader(item2)
    var agreement: TradeAgreement = new TradeAgreement(Trader1, Trader2)
    agreement.executeTrade()
    agreement.executeTrade()

    assert(Trader1.item == item2)
    assert(Trader2.item == item1)

  }
}