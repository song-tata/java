package ex2_interface.q2;

public interface Calc {
	//상수
	double PI = 3.141592;
	int ERROR = -9999999;
	//추상 메소드
	int add(int num1,int num2);
	int substract(int num1,int num2);
	int multi(int num1,int num2);
	double divide(int num1,int num2);
	int square(int num);
	
	
	//디폴트 메소드
	default void description() {
		System.out.println("인터페이스는 default 메소드를 포함할 수 있다.");
		myMethod();
		
	}
	//private 메소드
	private void myMethod() {
		System.out.println("인터페이스는 private 메소드를 포함할 수 있다.");
	}
	//static 메소드
	static void myStaticMethod() {
		System.out.println("인터페이스는 static 메소드를 포함할 수 있다.");
	}
	
}
