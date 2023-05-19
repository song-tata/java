package chap03_exem;

import java.util.Scanner;

public class ex3_EvenSum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int sum=0;
		int n;
		
		do {
			System.out.print("양의정수를 입력하세요");
			n = in.nextInt();
			
			
			if(n%2 == 0) {
				sum += n;
			}
			
			
		} while(n>0);
		System.out.println("입력한 양의 정수 중에서 짝수의 합은 "+sum);
	}

}
