package ch10_Car;

public class NormalCar extends Car{

	@Override
	public void drive() {
		System.out.println("엑셀을 밟는다");
	}

	@Override
	public void stop() {
		System.out.println("브레이크를 밟는다");
	}

	@Override
	public void wiper() {
		System.out.println("수동으로 와이퍼를 켠다");		
	}

	@Override
	public void wash() {
		System.out.println("세처하러감");
	}
	
}
