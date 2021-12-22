package ch16;

public class SuperLevel implements PlayerLevel{

	@Override
	public void run() {
		System.out.println("천천히 달림");
	}

	@Override
	public void jump() {
		System.out.println("높이 점프");
	}

	@Override
	public void turn() {
		System.out.println("방향변경은 불가능");
		
	}

	@Override
	public void showLevel() {
		System.out.println("=====중급자 레벨=====");
	}

	@Override
	public void go(int count) {
		run();
		for(int i=0; i<count; i++) {
			jump();
		}
		turn();
	}
	
}
