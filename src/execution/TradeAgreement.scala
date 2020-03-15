package execution
class TradeAgreement(val trader1: Trader, val trader2: Trader) {
  var count: Int = 0
  val accum: List[Valuable] = List(trader1.item, trader2.item)
  def executeTrade(): Unit = {
    while (this.count < 1){
      trader1.item = accum(1)
      trader2.item = accum.head
      this.count += 1
    }
  }
}
