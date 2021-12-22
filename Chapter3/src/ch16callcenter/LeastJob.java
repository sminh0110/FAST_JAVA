package ch16callcenter;

public class LeastJob implements Scheduler {
	@Override
	public void getNextCall() {
		System.out.println("상담전화를 순서대로 대기열에서 가져옴");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("대기가 적은 상담원에 배분");
	}
}
