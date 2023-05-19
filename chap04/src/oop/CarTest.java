package oop;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car(); // 자동차 1대 만듬(인스턴스)
		myCar.speed = 60;
		System.out.println(myCar.company);
		System.out.println(myCar.speed);
		
		Car yourCar = new Car();
		System.out.println(yourCar.speed);
		
	}

}
