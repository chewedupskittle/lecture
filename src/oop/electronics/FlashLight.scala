package oop.electronics

class FlashLight() extends Electronic() {
  override var battery = new Battery(5)
  this.accum = battery :: this.accum

  override def use(): Unit = {
    if(!(this.battery.charge == 0 )) {
      this.battery.charge -= 1
    }
  }

}
