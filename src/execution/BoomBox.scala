package execution

class BoomBox(var battery: Battery) {
  var accum: List[Battery] = List(battery)

  def use(): Unit = {
     if(!(this.battery.charge < 3)) {
      this.battery.charge -= 3
    }
  }
    def replaceBattery(replacement: Battery): Battery = {
      this.accum = replacement :: this.accum
      battery = this.accum.head
      accum(1)

    }
  }
