package oop.electronics

object UseElectronics {

  def useAll(lis: List[Electronic]): Unit = {
    for(item <- lis){
      item.use()
    }
  }

  def swapBatteries(item1: Electronic, item2: Electronic): Unit = {
    val buffer: List[Battery] = List(item1.battery, item2.battery)
    item1.battery = buffer(1)
    item2.battery = buffer.head
  }

}
