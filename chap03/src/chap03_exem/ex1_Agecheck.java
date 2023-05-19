package chap03_exem;

import java.util.Scanner;

public class ex1_Agecheck {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("나이입력");
		int num = in.nextInt();
		
		if(num >= 19) {
			System.out.println("성년");			
		}
		else {
			System.out.println("미성년");
		}
		
	}

}
