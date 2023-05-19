package util;

import java.util.Date;
import java.util.Scanner;

public class TimesMission {

	public static void main(String[] args) {
		Date s_Date = new Date();
		
		Date e_Date = new Date();
		boolean run = true;
		double times = 0;
		int seconds;
		String start;
		Scanner in = new Scanner(System.in);
		System.out.println("초 맞추기 게임 (오차범위 : +-0.05%");
		System.out.println("초 입력 : ");
		seconds = in.nextInt();
		
		
		System.out.println("아무키나 눌러 게임 시작");
		in.nextLine();
		while(!in.hasNextLine()) {
			//사용자가 입력하기전까지 무한대기
		}
		long s_time = System.currentTimeMillis();
		
		
		System.out.println("아무키나 눌러 게임 종료");
		in.nextLine();
		while(!in.hasNextLine()) {
			//사용자가 입력하기전까지 무한대기
		}
		long e_time = System.currentTimeMillis();
		
		System.out.println(s_time);
		System.out.println(e_time);
		
		times = (double)(e_time - s_time)/(1000);
		System.out.println(times+"초");
		if(seconds < times*1.05 && seconds > times *0.95) {
			System.out.println("맞췄습니다.");
		}else {
			System.out.println("틀렸습니다.");
		}
		System.out.println("오차: "+ Math.abs(seconds-times));
	}

}
