package execution

class VoteCounter(val possVotes: List[String]){
  val thing: List[String] = possVotes
  var newMap: scala.collection.mutable.Map[String, Int] = scala.collection.mutable.Map()
  for(option <- thing){
    newMap = newMap + (option -> 0)
  }

  def addVotes(option: String, num: Int): Unit = {
    if(possVotes.contains(option)){
      newMap(option) += num
    }
  }
  def getVotes(option: String): Int = {
    if (possVotes.contains(option)) {
      newMap(option)
    }
    else {
      0
    }
  }


}
