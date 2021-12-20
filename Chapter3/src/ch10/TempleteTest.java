package ch10;

public class TempleteTest {
	public static void main(String[] args) {
		CarTemplete normalCar = new NormalCar();
		CarTemplete aiCar = new AICar();
		
		normalCar.run();
		aiCar.run();
	}
}
