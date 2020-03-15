package tests
import oop.electronics.{Battery, BoomBox, Electronic, FlashLight, UseElectronics}
import org.scalatest._
class TestElectronics extends FunSuite {
  test("HaHa stinky"){
    val battery1: Battery = new Battery(10)
    val battery2: Battery = new Battery(50)
    val battery3: Battery = new Battery(0)

    val flash1: FlashLight = new FlashLight()
    val flash2: FlashLight = new FlashLight()
    val boom1: BoomBox = new BoomBox(battery1)
    val boom2: BoomBox = new BoomBox(battery2)
    val boom3: BoomBox = new BoomBox(battery3)

    val accum: List[Electronic] = List(flash1, flash2, boom1, boom2, boom3)

    UseElectronics.useAll(accum)
    UseElectronics.useAll(accum)


    assert(flash1.battery.charge == 3)
    assert(flash2.battery.charge == 3)
    assert(boom1.battery.charge == 4)
    assert(boom2.battery.charge == 44)
    assert(boom3.battery.charge == 0)

    UseElectronics.swapBatteries(flash1, boom1)
    assert(flash1.battery.charge == 4)
    assert(boom1.battery.charge == 3)


    UseElectronics.swapBatteries(flash1, boom1)
    assert(flash1.battery.charge == 3)
    assert(boom1.battery.charge == 4)



    UseElectronics.swapBatteries(boom3, boom1)
    assert(boom3.battery == battery1)
    assert(boom1.battery == battery3)








  }
}
