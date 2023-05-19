package roof.dowhiletest;

import java.util.Scanner;

/*
 * 사용자에게 계속 입력
 * q라는 입력을 받을 때까지
 * 무한반복
 */
public class ex2_Dowhiletest2 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("메세지 입력(종료:q)");
		
		String str;
		
		do {
			//입력 실행문
			str = scanner.nextLine();
			System.out.println("입력값은 "+str);
		}while(!str.equals("q"));
		
		System.out.println("end");
	}
	
}
