package roof.whiletest;

import java.util.Scanner;

public class ex2_WhileSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int n = in.nextInt();
		int sum = 0;
		//1부터 n까지의 합을 구하는 프로그램
		while(n>=0) {
			sum += n--;
			
		}
		System.out.println(sum);
	}

}
