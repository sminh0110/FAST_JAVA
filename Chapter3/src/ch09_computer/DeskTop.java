package ch09_computer;

public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("데스크탑 디스플레이");
	}

	@Override
	public void typing() {
		System.out.println("데스크탑에 타이핑");
	}

	@Override
	public void turnOff() {
		System.out.println("데스크탑 종료");
	}
	
	

}
