package execution
class FlashLight {
  var battery: Battery = new Battery(5)
  var accum: List[Battery] = List(battery)
  def use(): Unit = {
    if(!(this.battery.charge == 0 ))
      this.battery.charge -= 1
  }

  def replaceBattery(replacement: Battery): Battery = {
    this.accum = replacement :: this.accum
    this.battery = this.accum.head
    accum(1)

  }

}
