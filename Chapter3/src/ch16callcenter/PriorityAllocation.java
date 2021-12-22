package ch16callcenter;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("우선순위가 높은 고객에게 숙련도 높은 상담원을 우선적으로 배분");
	}
	
}
