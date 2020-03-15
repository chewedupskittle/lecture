package oop.electronics

class BoomBox(override var battery: Battery) extends Electronic(){
  this.accum = battery :: this.accum

  override def use(): Unit = {
    if(!(this.battery.charge < 3)) {
      this.battery.charge -= 3
    }
  }

}
