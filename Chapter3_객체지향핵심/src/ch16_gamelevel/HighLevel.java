package ch16_gamelevel;

public class HighLevel implements Level{
	@Override
	public void run() {
		System.out.println("속도 3의 달리기");
	}

	@Override
	public void jump() {
		System.out.println("높이 3의 점프");		
	}

	@Override
	public void hit() {
		System.out.println("데미지 3의 공격");		
	}
}
