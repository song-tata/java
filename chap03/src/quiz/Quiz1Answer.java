package quiz;

import java.util.Scanner;

public class Quiz1Answer {

	public static void main(String[] args) {
		int answer = (int)(Math.random()*100+1);
		int input;
		int count = 0;
		Scanner in = new Scanner(System.in);
		
		do {
			System.out.println("1~100사이 정수 입력");
			input = in.nextInt();
			
			if(input > answer) {
				System.out.println("Down");
			}else if(input<answer) {
				System.out.println("up");
			}
			count++;
			
		}while(answer != input);
		System.out.println("정답");
		System.out.println(count+"번만에 정답!");
	}

}
