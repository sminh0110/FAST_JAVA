package ch09_computer;

//공통으로 사용할 메서드만 구현하고 따로 구현할 것은 하위클래스에 책임을 위임한다
//나는 구현하지 않을테니 하위클래스인 너희가 구현해라
public abstract class Computer { 
	
	public abstract void display();
	public abstract void typing();
	public void turnOn() {
		System.out.println("전원 켬");
	}
	public void turnOff() {
		System.out.println("전원 끔");
	}
}
