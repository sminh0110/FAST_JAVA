package ch16_callcenter;

import java.util.Scanner;

public class Scheduler {
	
	private String typeCode;
	
	public String getTypeCode() {
		return typeCode;
	}

	public void getType() {
		System.out.println("원하는 배분방식 선택\rR: round robin\rP: priority\rL: least job\r대소문자는 상관없음");
		Scanner sc = new Scanner(System.in);
		typeCode = sc.next();
	}
	
	public void contribute() {
		System.out.println("잘못된 타입지정");
	}
}
