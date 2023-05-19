package exam;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		int hund = 0;
		int ten = 0;
		int one = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("0~999 사이의 수를 입력하세요 : ");
		int num = in.nextInt();
		
		hund = num/100;
		one = num%10;
		ten = (num%100 - one)/10;
		
		System.out.println("각 자리 숫자의 합"+(hund+ten+one));
	}
	
//	public static void hap(String[] args) {
//		
//		Scanner in = new Scanner(System.in);
//		System.out.println("0~999 사이의 수를 입력하세요 : ");
//		int num = in.nextInt();
//		int sum1;
//		
//		sum1 = num%10;
//		num = num/10;
//		sum1 += num%10;
//		num = num/10;
//		sum1 += num%10;
//	}
}
