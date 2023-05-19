package programmingproblum;

public class ex3_Car {
	String car;
	static int cnt = 0;
	static int redCarcnt = 0;
	
	
	public ex3_Car() {
		
	}
	
	public ex3_Car(String car) {
	this.car = car;
	cnt++;
		if(car.equals("red")||(car.equals("RED"))) {
			redCarcnt++;
			}
	}
	
	public static int getNumOfCar() {
		return cnt;
		
	}
	public static int getNumOfRedCar() {
		return redCarcnt;
	}
}
