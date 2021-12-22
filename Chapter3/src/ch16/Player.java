package ch16;

public class Player {
	private PlayerLevel level = new BeginnerLevel();
	
	public PlayerLevel getLevel() {
		return level;
	}
	
	public void changeLevel(PlayerLevel level){
		this.level = level;
	}
	
	public void play() {
		if(level instanceof BeginnerLevel) level.go(1);
		if(level instanceof AdvancedLevel) level.go(2);
		if(level instanceof SuperLevel) level.go(3);
	}
}
