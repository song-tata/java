package exam;

import java.util.Scanner;

/*
 * 초 단위 구하기
 * 1분은 60초,
 * 1시간은 60*60초
 */
public class ex2 {

	public static void main(String[] args) {
		
		int hour = 0;
		int min = 0;
		int sec = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("초 단위의 정수를 입력하세요 :");
		int time = in.nextInt();
		
		hour = (time/60)/60;
		min = (time/60)%60;
		sec = time%60;
		
		System.out.printf("%d시간 %d분 %d초",hour,min,sec);
		
		
		
		
		
		
		
//		if(second>=3600) {
//			
//			hour = second/3600;
//			min = (second/60)-(hour*60);
//			sec = second%60;
//			System.out.println( hour+"시간 "+min+"분 "+sec+"초");
//			
//		}
//		else if(second<3600){
//			min = second/60;
//			sec = second%60;
//			System.out.println("0시간"+min+"분 "+sec+"초");
//		}
	}

}
