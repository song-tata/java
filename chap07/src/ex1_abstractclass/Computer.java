package ex1_abstractclass;

//추상클래스를 선언하는 방법 : abstract
//추상 클래스는 상속만을 위해 사용한다!
public abstract class Computer {
	abstract void display(); //추상메서드
	abstract void typing();
	
	public void turnOn() {
		System.out.println("전원 on");
	}
	
	public void turnOff() {
		System.out.println("전원 off");
	}
	
}
