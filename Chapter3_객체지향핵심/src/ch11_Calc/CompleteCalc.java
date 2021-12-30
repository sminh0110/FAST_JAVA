package ch11_Calc;

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
	
}
