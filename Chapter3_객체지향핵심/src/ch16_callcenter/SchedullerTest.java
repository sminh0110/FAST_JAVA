package ch16_callcenter;

public class SchedullerTest {
	public static void main(String[] args) {
		Scheduler scheduler = new Scheduler();
		scheduler.getType();
		if(scheduler.getTypeCode().equals("R")||scheduler.getTypeCode().equals("r")) {
			scheduler = new RoundRobin();
		}
		else if(scheduler.getTypeCode().equals("P")||scheduler.getTypeCode().equals("p")) {
			scheduler = new PriorityAllo();
		}
		else if(scheduler.getTypeCode().equals("L")||scheduler.getTypeCode().equals("l")) {
			scheduler = new LeastJob();
		}
		else {
			System.out.println("잘못된 타입코드");
		}
		scheduler.contribute();
	}
}
