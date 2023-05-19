package exam;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		int day;
		int month;
		Scanner a1 = new Scanner(System.in);
		System.out.println("날짜 입력");
		day = a1.nextInt();
		System.out.println("달 입력");
		month = a1.nextInt();
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 10: case 12:
			if(day < 0 || day > 32)
				System.out.println("유효하지않은 날짜입니다.");
			else
				System.out.println("유효한 날짜입니다.");
			break;
		case 2:
			if(day < 0 || day > 28)
				System.out.println("유효하지않은 날짜입니다.");
			else
				System.out.println("유효한 날짜입니다.");
			break;			
		case 4: case 8: case 9: case 11:
			if(day < 1 || day > 31)
				System.out.println("유효하지않은 날짜입니다.");
			else
				System.out.println("유효한 날짜입니다.");
			break;
		default:
			System.out.println("유효하지않은 날짜입니다.");
			break;
		}
		
		
		
	}

}
