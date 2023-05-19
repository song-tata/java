package exceptions;



public class ExceptionHandling {
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자수"+ result);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage()); // 예외 발생 이유
			System.out.println(e.toString()); // 이유 + 종류
			e.printStackTrace();// 이유 + 종류 + 위치
		}finally {
			System.out.println("마무리 실행");
		}
	}
	
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		printLength("java");
		printLength("");
		printLength(null);
		System.out.println("프로그램 종료");
	}

}
