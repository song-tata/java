package input;

import java.util.Scanner;

public class ex1_Scanner {

	public static void main(String[] args) {
		//스캐너 객체 생성
		Scanner in = new Scanner(System.in);
		
		System.out.print("숫자 입력: ");
		int n1 = in.nextInt();
		
		System.out.println(n1);
		
		System.out.println("s1 입력");
		String s1 = in.next();
		System.out.println(s1);
		
//		System.out.println("s2 입력");
//		String s2 = in.nextLine();
//		System.out.println(s2);
	
	}

}
