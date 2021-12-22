package ch16;

public class PlayerLevelTest {
	public static void main(String[] args) {
		Player p1 = new Player();
		p1.play();
		p1.changeLevel(new AdvancedLevel());
		p1.play();
		p1.changeLevel(new SuperLevel());
		p1.play();
	}
}
