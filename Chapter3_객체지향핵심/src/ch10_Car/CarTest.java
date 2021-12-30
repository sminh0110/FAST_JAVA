package ch10_Car;

public class CarTest {
	public static void main(String[] args) {
		Car aiCar = new AICar();
		aiCar.run();
		System.out.println("===");
		Car car = new NormalCar();
		car.run();
		
	}
}
