package chap03_exem;

import java.util.Scanner;

public class ex2_SwhitchCheck {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("등수입력");
		int n = in.nextInt();
		
		switch (n) {
		case 1:
			System.out.println("아주잘했습니다.");			
			break;
		case 2: case 3:
			System.out.println("잘했습니다.");			
			break;
		case 4: case 5: case 6:
			System.out.println("보통");			
			break;
		default:
			System.out.println("노력하세요!");
			break;
		}
		
	}

}
