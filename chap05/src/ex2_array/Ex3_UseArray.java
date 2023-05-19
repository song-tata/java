package ex2_array;

import java.util.Scanner;

public class Ex3_UseArray {
public static void main(String[] args) {
	
	int[] jumsu = new int[5];
	int hap = 0;
	double avg = 0.0;
	
	String[] jumsu_name = {"국어","영어","수학","과학","사회"};
	
	Scanner s = new Scanner(System.in);
	for(int i = 0; i<jumsu_name.length;i++) {
		System.out.println(jumsu_name[i]+"점수입력");
		jumsu[i] = s.nextInt();
		hap += jumsu[i];
		
	}
	avg = (double)hap/jumsu_name.length;
	System.out.println("총 합은 : "+hap);
	System.out.println("평균 : "+avg);
}
}
