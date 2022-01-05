package ch16_gamelevel;

public class LowLevel implements Level{

	@Override
	public void run() {
		System.out.println("속도 1의 달리기");
	}

	@Override
	public void jump() {
		System.out.println("높이 1의 점프");		
	}

	@Override
	public void hit() {
		System.out.println("데미지 1의 공격");		
	}

}
