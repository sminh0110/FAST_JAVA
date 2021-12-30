package ch10_Car;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	public abstract void wiper();
	public void turnOn() {
		System.out.println("시동 켬");	
	}
	public void turnOff() {
		System.out.println("시동 끔");	
	}
	public void wash() {} //구현은 했지만 실행내용이 없는 메서드
	
	public void run() {
		turnOn();
		drive();
		wiper();
		stop();
		turnOff();
		wash();
	}
}
