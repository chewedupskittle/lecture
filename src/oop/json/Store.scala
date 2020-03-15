package oop.json
import play.api.libs.json.{JsValue, Json}

class Store(var cashInRegister: Double, var inventory: List[String]) {

  def asJSON(): String = {
    val inventObj: JsValue = Json.toJson(inventory)
    val cash: JsValue = Json.toJson(cashInRegister)
    val obj: Map[String, JsValue] = Map("cashInRegister" -> cash, "inventory" -> inventObj)
    val objString: JsValue = Json.toJson(obj)
    Json.stringify(objString)

  }
  def fromJSON(jsonString: String): Unit = {
    val parsed: JsValue = Json.parse(jsonString)
    val cash: Double = (parsed \ "cashInRegister").as[Double]
    val invent: List[String] = (parsed \ "inventory").as[List[String]]
    cashInRegister = cash
    inventory = invent
  }

}
