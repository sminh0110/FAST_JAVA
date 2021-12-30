package ch06_polymophism;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		ArrayList<Customer> customerList = new ArrayList<>();

		Customer c1 = new Customer(10010, "철수");
		Customer c2 = new Customer(10020, "민호");
		Customer c3 = new GoldCustomer(10030, "정수");
		Customer c4 = new GoldCustomer(10040, "인겸");
		Customer c5 = new VIPCustomer(10050, "동현");

		customerList.add(c1);
		customerList.add(c2);
		customerList.add(c3);
		customerList.add(c4);
		customerList.add(c5);

		/*
		 * for(Customer customer: customerList) {
		 * System.out.println(customer.showCustomerInfo()); }
		 * 
		 * int price = 10000; for(Customer customer: customerList) { int cost =
		 * customer.calcPrice(price);
		 * System.out.println(customer.getCustomerName()+"님이 "+cost+"원 지불");
		 * System.out.println(customer.getCustomerName()+"님의 보너스 포인트는 "+customer.
		 * bonusPoint); }
		 */

		if (c3 instanceof GoldCustomer) {
			GoldCustomer gc = (GoldCustomer) c3;
			System.out.println(gc.showCustomerInfo());
		}
	}
}