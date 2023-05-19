package util;

import java.util.Calendar;
import java.util.Date;
//Date : 1900년
public class DateTest {

	public static void main(String[] args) {
		//상위 버전에서 삭제 예정(취소선 존재)
		Date date = new Date();
		//캘린더 사용 권장
		Calendar c = Calendar.getInstance();
		System.out.println("캘린더"+c.getTime());
		
		System.out.println(date.getYear()+1900);
		System.out.println(date.getMonth()+1);//1월이 0이기때문에 3월이 나옴
		System.out.println(date.getDay());//일요일:0
		System.out.println(date.getDate());
//		현재 시간을 (1970/1/1이후 진행시간을 ms단위로 리턴)
		System.out.println("Time : "+date.getTime());
		System.out.println(date.getHours());
		
		
	}
}
