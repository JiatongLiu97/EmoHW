import java.util.ArrayList;
import java.util.List;

public class League {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create players in team1
		Player player1InTeam1 = new Player("player1InTeam1");
		Player player2InTeam1 = new Player("player2InTeam1");
		Player player3InTeam1 = new Player("player3InTeam1");
		
		// Create List of players in team1
		List<Player> playersTeam1 = new ArrayList<>();
		playersTeam1.add(player1InTeam1);
		playersTeam1.add(player2InTeam1);
		playersTeam1.add(player3InTeam1);
		
		
		// Create players in team2
		Player player1InTeam2 = new Player("player1InTeam2");
		Player player2InTeam2 = new Player("player2InTeam2");
		Player player3InTeam2 = new Player("player3InTeam2");
		
		// Create List of players in team1
		List<Player> playersTeam2 = new ArrayList<>();
		playersTeam2.add(player1InTeam2);
		playersTeam2.add(player2InTeam2);
		playersTeam2.add(player3InTeam2);
		
		// Create two teams
		Team team1 = new Team("team1", playersTeam1);
		Team team2 = new Team("team2", playersTeam2);
		
		// Create goals
		Goal goal1 = new Goal(team1, player1InTeam1, 10.1);
		Goal goal2 = new Goal(team1, player2InTeam1, 19.4);
		Goal goal3 = new Goal(team1, player3InTeam1, 80.0);
		Goal goal4 = new Goal(team2, player1InTeam2, 70.1);
		Goal goal5 = new Goal(team2, player1InTeam2, 81.1);
		List<Goal> goals = new ArrayList<>();
		goals.add(goal1);
		goals.add(goal2);
		goals.add(goal3);
		goals.add(goal4);
		goals.add(goal5);
		
		// create Game
		Game game = new Game(team1, team2, goals);
		game.displayResult();
		
	}

}
