package ch14;

public class CompleteCalc extends Calculater{

	@Override
	public int times(int num1, int num2) {
		if(num2==0) {
			return ERROR;
		}
		return num1*num2;
	}

	@Override
	public int devide(int num1, int num2) {
		return num1/num2;
	}
	
	@Override
	public void description() {
		System.out.println("완성된 사칙연산 계산기다");
	}	
}
