package util;

import java.util.Date;

public class Times {

	public static void main(String[] args) {
		Date s_date = new Date();
		long s_time = System.currentTimeMillis();//시작시간
		for(int i = 0; i<5000; i++) {
			System.out.println(i);
		}
		Date e_date = new Date();
		long e_time = System.currentTimeMillis();
		System.out.println("수행시간");
		System.out.println(e_time-s_time);
	}

}
