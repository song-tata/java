package ex2_interface;

public interface Flyer {
	int FAST_SPEED = 100; //모든 필드는 상수가 된다. final 생략
	
	void fly(); // 인터페이스의 모든 메소드는 추상 메소드. abstract 생략
	boolean isAnimal();
}
