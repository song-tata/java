package programmingproblum;

import java.util.Scanner;

public class ex8_DayCheck {
	enum Day {
		//영문 대문자로 요일을 나타내는 열거타입 정의
		MONDAY, TUESDAY, WEDNEDAY, THURSDAY, FRIDAY, SATURADAY, SUNDAY,
		월요일 , 화요일, 수요일, 목요일, 금요일, 토요일, 일요일
	}
	//요일별로 기분을 출력해주는 메서드
	public static void dayLike(Day day) {
		switch (day) {
		case MONDAY:
		case 월요일:
			System.out.println("싫다");
			break;
		case FRIDAY:
		case 금요일:
			System.out.println("좋다");
			break;
		case SATURADAY : case SUNDAY :
		case 토요일: case 일요일:
			System.out.println("최고");
			break;
		default:
			System.out.println("그저그렇다");
			break;
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("요일입력:");
		String s = in.next();
		s = s.toUpperCase();
		
		System.out.println(s);
		Day day = Day.valueOf(s);//문자열 s를 enum타입으로 형변환
		
		dayLike(day);
	}

}
