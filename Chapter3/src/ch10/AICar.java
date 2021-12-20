package ch10;

public class AICar extends CarTemplete {

	@Override
	protected void drive() {
		System.out.println("AI가 차를 주행한다");
	}

	@Override
	protected void stop() {
		System.out.println("AI가 차를 멈춘다");
	}

}
