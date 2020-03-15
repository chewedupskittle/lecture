package execution
import execution.Team
object Referee {
  def playGame(team1: Team, team2: Team): Unit = {
    if(team1.offense > team2.defense) {
      team1.score += team1.offense - team2.defense
    }
    if(team2.offense > team1.defense) {
      team2.score += team2.offense - team1.defense
    }
  }

  def declareWinner(team1: Team, team2: Team): Team ={
    if(team1.score > team2.score){
      team1
    }
    else if(team2.score > team1.score){
      team2
    }
    else{
      val tie: Team = new Team(0, 0)
      tie
    }
  }

}
