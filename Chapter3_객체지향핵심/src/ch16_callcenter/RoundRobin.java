package ch16_callcenter;

public class RoundRobin extends Scheduler{
	@Override
	public void contribute() {
		System.out.println("RoundRobin");
	}
		
}
