package step1;

public abstract class Car {
	abstract void run();
	abstract void refuel();
	
	public void stop() {
		System.out.println("차가 멈춥니다.");
	}
}
