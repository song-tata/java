package testfile;

import java.util.Scanner;

public class six {

	public static void main(String[] args) {
		int maxNum = 0;
		int minNum = 0;
		
		Scanner in = new Scanner(System.in);
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		if(a<b) {
			minNum = a;
			maxNum = b;
		}else if(a>b) {
			minNum = b;
			maxNum = a;
		}
		int sum = 0;
		int multiply = 0;
		
		for(int i = minNum; i < maxNum;i++) {
			sum += i;
		}
		
		for(int i = minNum; i < maxNum;i++) {
			if(i%3 == 0) {
				if(minNum % 3 == 0) {
					multiply += i*i;
					multiply = multiply-(minNum*minNum);
				}else				
				multiply += i*i;
			}
		}
		
		System.out.println("합 :"+(sum-minNum));
		System.out.println("3의 배수의 제곱의 합" + multiply);
	}

}
