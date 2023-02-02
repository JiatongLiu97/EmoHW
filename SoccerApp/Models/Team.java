package Models;
import java.util.List;

public class Team {
	public String teamName;
	public List<Player> players;
	
	public Team(String teamName, List<Player> players) {
		this.teamName = teamName;
		this.players = players;
	}
}
