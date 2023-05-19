package programming;

public class one {

	public static void main(String[] args) {
		MyDate d = null;
		try {
			System.out.printf("%d년 %d월 %d일\n",d.year, d.month d.day);	
		}catch (NullPointerException e) {
			System.out.println("에러");
		}
		
	}

}
