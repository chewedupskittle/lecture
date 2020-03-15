package oop.electronics

abstract class Electronic() {
  var battery: Battery
  var accum: List[Battery] = List()

  def use(): Unit = {
  }

  def replaceBattery(replacement: Battery): Battery = {
    this.accum = replacement :: this.accum
    battery = this.accum.head
    accum(1)

  }

}
