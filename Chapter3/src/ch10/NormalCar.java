package ch10;

public class NormalCar extends CarTemplete{
	@Override
	protected void drive() {
		System.out.println("운전자가 차를 주행한다");
	}

	@Override
	protected void stop() {
		System.out.println("운전자가 차를 멈춘다");
	}
}
