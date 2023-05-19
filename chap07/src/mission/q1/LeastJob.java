package mission.q1;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		System.out.println("전화 온 순서대로 고객의 전화를 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("쉬고 있거나 대기가 가장 적은 상담원에게 할당");		
	}

}
