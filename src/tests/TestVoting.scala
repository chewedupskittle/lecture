package tests
import execution.VoteCounter
import org.scalatest._
class TestVoting extends FunSuite{
  test ("i don't know if this will work"){
    val lis: VoteCounter = new VoteCounter(List("x", "y"))


    lis.addVotes("x", 12)
    lis.addVotes("x", 34)
    lis.addVotes("x", 56)
    lis.addVotes("y", 56)
    lis.addVotes("aaa", 123)

    assert(lis.getVotes("x") == 102)
    assert(lis.getVotes("y") == 56)
    assert(lis.getVotes("aaa") == 0)
  }
}
