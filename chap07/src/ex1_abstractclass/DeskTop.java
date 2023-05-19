package ex1_abstractclass;

public class DeskTop extends Computer {

	@Override
	void display() {
		System.out.println("DeskTop display");
	}

	@Override
	void typing() {
		System.out.println("DeskTop typing");
	}

	@Override
	public void turnOn() {
		System.out.println("DeskTop on");
	}
	
	
}
