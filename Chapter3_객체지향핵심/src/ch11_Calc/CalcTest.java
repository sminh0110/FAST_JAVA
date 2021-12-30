package ch11_Calc;

public class CalcTest {
	public static void main(String[] args) {
		Calc calc = new CompleteCalc();
		
		int num1 = 10;
		int num2 = 2;
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.devide(num1, num2));
		
		//calc는 Calc인터페이스에서 선언한 메서드만 사용가능하다
		//최상위 클래스 Object의 메서드도 사용가능하다
	}
}