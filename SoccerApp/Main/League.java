package Main;

import java.util.ArrayList;
import java.util.List;

import Models.Game;
import Models.Goal;
import Models.Player;
import Models.Team;

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
		
		
		// create Game
		List<Goal> goals = new ArrayList<>();
		Game game = new Game(team1, team2, goals);
		game.start();
		game.displayResult();
		
	}

}