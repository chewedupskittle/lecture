package tests
import oop.electronics.{Battery, BoomBox, FlashLight}
import org.scalatest._

class TestBatteries extends FunSuite{
  test("this is a test") {
    var batteryBoom: Battery = new Battery(6)
    var boomBox: BoomBox = new BoomBox(batteryBoom)
    var flashLight: FlashLight = new FlashLight()
    var replacementF: Battery = new Battery(200)
    var replacementB: Battery = new Battery(2)
    var firstBattery: Battery = flashLight.battery

    flashLight.use()
    flashLight.use()
    flashLight.use()
    flashLight.use()
    flashLight.use()
    flashLight.use()

    boomBox.use()
    boomBox.use()
    boomBox.use()

    assert(flashLight.battery.charge == 0)
    assert(boomBox.battery.charge == 0)

    assert(boomBox.replaceBattery(replacementB) == batteryBoom)
    assert(boomBox.battery == replacementB)
    boomBox.use()
    assert(boomBox.battery.charge == 2)


    assert(flashLight.replaceBattery(replacementF) == firstBattery)
    assert(flashLight.battery == replacementF)
    assert(flashLight.battery != firstBattery)







  }
}
