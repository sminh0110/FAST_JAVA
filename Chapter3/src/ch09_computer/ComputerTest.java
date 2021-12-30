package ch09_computer;

public class ComputerTest {
	public static void main(String[] args) {
		Computer desktop = new DeskTop();
		desktop.display();
		
		Computer mylaptop = new MyLapTop();
		mylaptop.display();
	}
}
