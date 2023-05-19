package exam;

import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		int hap;
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("전공 이수 학점 : ");//ln = 줄바꿈
		int  jeon = in.nextInt();
		System.out.println("교양 이수 학점 : ");
		int  gyo = in.nextInt();
		System.out.println("일반 이수 학점 : ");
		int  il = in.nextInt();
		
		hap = jeon+gyo+il;
		
		String x1 = hap >= 140 && jeon >= 70 
				&&((gyo >= 30 && il >= 30)
			    ||(gyo + il>=80))? 
				"졸업 가능":"졸업 불가";
//		hap>140? (jeon>=70? "졸업가능":"졸업불가"):(gyo+il>=80? ); 
		System.out.println(x1);
	}
}
;