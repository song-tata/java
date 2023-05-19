package quiz;

import java.util.Scanner;

public class quiz1 {

	public static void main(String[] args) {
		int answer = (int)(Math.random()*100)+1; // 1~100사이의 정수형 난수생성기
		int a;
		int count = 0;
		Scanner in = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("숫자를 입력하세요: ");
			a = in.nextInt();
			count++;
			if(a>answer) {
				System.out.printf("%d 보다 작습니다\n",a);
			}else if(a<answer) {
				System.out.printf("%d 보다 큽니다\n",a);
			}else {
				System.out.println("정답입니다"+answer);
				System.out.println("입력횟수는"+count+"입니다.");
				break;
			}
			
		}
		
	}
	
}
