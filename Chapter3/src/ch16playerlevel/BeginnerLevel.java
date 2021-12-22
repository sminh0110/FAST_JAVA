package ch16playerlevel;

public class BeginnerLevel implements PlayerLevel {

	@Override
	public void run() {
		System.out.println("빨리 달림");
	}

	@Override
	public void jump() {
		System.out.println("점프 불가능");
	}

	@Override
	public void turn() {
		System.out.println("방향변경 불가능");
		
	}

	@Override
	public void showLevel() {
		System.out.println("=====초급자 레벨=====");
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
