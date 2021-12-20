package ch10;

public abstract class CarTemplete {

	protected abstract void drive();
	protected abstract void stop();
	
	public void turnOn() {
		System.out.println("시동을 켠다");
	}
	
	public void turnOff() {
		System.out.println("시동을 끈다");
	}

	final public void run() {
		System.out.println("===");
		turnOn();
		drive();
		stop();
		turnOff();
		System.out.println("===");
	}
	
}
