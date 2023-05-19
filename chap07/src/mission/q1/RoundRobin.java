package mission.q1;

public class RoundRobin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("전화 온 순서대로 고객의 전화를 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("한명씩 차례로 할당");
	}

}
