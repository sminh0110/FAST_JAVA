package ch10_Car;

public class AICar extends Car{

	@Override
	public void drive() {
		System.out.println("자율주행");
	}

	@Override
	public void stop() {
		System.out.println("스스로 멈춤");
	}

	@Override
	public void wiper() {
		System.out.println("자동으로 와이퍼 켬");
	}

}
