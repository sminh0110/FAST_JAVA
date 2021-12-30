package ch14;

public interface Calc {
	double PI = 3.14;
	int ERROR = -99999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int devide(int num1, int num2);
	
	default void description() { //디폴트메서드
		System.out.println("정수의 사칙연산을 제공한다");
		myMethod();
	}
	
	static int total(int[] arr) { //정적메서드
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		myStaticMethod();
		return total;
	}
	
	private void  myMethod() {
		System.out.println("myMwthod");
	}
	
	private static void myStaticMethod() {
		System.out.println("myStaticMethod");
	}
}
