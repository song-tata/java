package mission.q1;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		
		System.out.println("전화 상담 방식을 선택하세요.");
		
		System.out.println("R : 한명씩 차례대로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		
		int ch = System.in.read();
		
		Scheduler scheduler = null;
		
		if(ch == 'r' || ch == 'R' ) {
			scheduler = new RoundRobin();
		}else if (ch == 'l' || ch == 'L') {
			scheduler = new LeastJob();
		}else if (ch == 'p' || ch == 'P') {
			scheduler = new PriorityAllocation();
		}else if(ch == 'a' || ch == 'A') {
			scheduler = new AgentGetCall();
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
	}

}
