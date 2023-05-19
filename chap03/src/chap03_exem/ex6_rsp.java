package chap03_exem;

import java.util.Scanner;

public class ex6_rsp {
	
	public static void main(String[] args) {
		String s1;
		String s2;
		String s3;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("철수: ");
		s1 = in.next();
		System.out.println("영희: ");
		s2 = in.next();
		
		if(s1.equals(s2)) {
			s3 = "tie";
		}else if(s1.equals("r") && s2.equals("s")||
				s1.equals("s") && s2.equals("p")||
				s1.equals("p") && s2.equals("r")
				) {
			s3 = "철수";
			
		}else {
			s3 = "영희";
		}
		
		if(s3.equals("tie")) {
			System.out.println("무승부입니다!");
		} else {
			System.out.println(s3 + "가 이겼습니다!");
		}
			
		
		
	}

}
