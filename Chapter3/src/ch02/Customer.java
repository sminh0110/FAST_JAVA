package ch02;

public class Customer {
	
	private int customerID;
	private String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	public Customer() {
		customerGrade = "Silver";
		bonusRatio = 0.01;
	}
	
	public int calcPrice(int price) {
		bonusPoint += price*bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName +"님의 등급은 "+customerGrade+"이며, 잔여포인트는 "
				+bonusPoint+" 입니다";
	}
}
