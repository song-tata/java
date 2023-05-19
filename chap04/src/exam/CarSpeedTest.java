package exam;

import java.util.Scanner;

public class CarSpeedTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int goToStop;
		int nowSpeed = 0;
		
		while(true) {
			System.out.println("1. 가속 2. 감속 3. 종료 ");
			goToStop = in.nextInt();
			switch(goToStop) {
			case 1: nowSpeed += 10;
			System.out.println("속도가 10 증가했습니다 "+nowSpeed);
			if(nowSpeed > 60) {
				System.out.println("속도가 너무 빠릅니다. 속도를 줄이세요");
			}
			
			break;
			case 2: if(nowSpeed==0) {
				System.out.println("주행 종료");
				break;
			}else{
				nowSpeed -= 10;
				System.out.println("속도가 10 줄었습니다 "+nowSpeed);
				break;
			}
			
			}
			if(goToStop == 3 && nowSpeed == 0) {
				System.out.println("주행 종료");
				break;
			}else {
				System.out.println("다시 입력하세요");
				
			}
		}
	}

}
