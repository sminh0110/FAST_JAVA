package ch16_gamelevel;

public class MiddleLevel implements Level{
	@Override
	public void run() {
		System.out.println("속도 2의 달리기");
	}

	@Override
	public void jump() {
		System.out.println("높이 2의 점프");		
	}

	@Override
	public void hit() {
		System.out.println("데미지 2의 공격");		
	}
}
