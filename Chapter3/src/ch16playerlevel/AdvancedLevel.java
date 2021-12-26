package ch16playerlevel;

public class AdvancedLevel implements PlayerLevel {

	@Override
	public void run() {
		System.out.println("아주 빠르게 달림");
	}

	@Override
	public void jump() {
		System.out.println("아주 높이 점프");
	}

	@Override
	public void turn() {
		System.out.println("방향변경");
		
	}

	@Override
	public void showLevel() {
		System.out.println("=====중급자 레벨=====");
	}

	@Override
	public void go(int count) {
		showLevel();
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
}