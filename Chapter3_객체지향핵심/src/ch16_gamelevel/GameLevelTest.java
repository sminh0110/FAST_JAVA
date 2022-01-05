package ch16_gamelevel;

public class GameLevelTest {
	public static void main(String[] args) {
		Player p1 = new Player();
		p1.playerLevel = new LowLevel();
		p1.play();
		
		p1.playerLevel = new MiddleLevel();
		p1.play();
		
		p1.playerLevel = new HighLevel();
		p1.play();
		
	}
}
