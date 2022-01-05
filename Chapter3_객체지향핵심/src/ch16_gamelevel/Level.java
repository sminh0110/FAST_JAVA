package ch16_gamelevel;

public interface Level {
	public void run();
	public void jump();
	public void hit();
	
	default void play() {
		System.out.println("===");
		run();
		run();
		jump();
		hit();
		System.out.println("===");
	}
}
