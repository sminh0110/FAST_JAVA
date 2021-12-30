package ch14;

public class CalcTest {
	public static void main(String[] args) {
		/*
		 * Calc calc = new CompleteCalc();
		 * 
		 * int num1 = 10; int num2 = 2;
		 * 
		 * calc .description();
		 */
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr)); //static메서드라서 인스턴스화하지 않고 사용가능
		
		
	}
}