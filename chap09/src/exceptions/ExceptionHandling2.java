package exceptions;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("String 클래스가 있어용");
		}catch(ClassNotFoundException e) {
			System.out.println(e.toString()); // 이유와 종류
		}
		System.out.println();
		try {
			Class.forName("java.lang.String2");
			System.out.println("String 클래스가 있어용");
		}catch(ClassNotFoundException e) {
			System.out.println(e.toString()); // 이유와 종류
		}
	}

}
