package exceptions;

public class ThrowsException1 {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			System.out.println("이 클래스는 존재하지않습니다.");
		}
		System.out.println("프로그램 종료");
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String");
}
}
