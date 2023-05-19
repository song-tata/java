package programmingproblum;

import oop.Car;

public class ex3_CarTest {

	public static void main(String[] args) {
		ex3_Car c1 = new ex3_Car("red");
		ex3_Car c2 = new ex3_Car("blue");
		ex3_Car c3 = new ex3_Car("RED");
		
		System.out.printf("자동차 수: %d 빨간차 수: %d",ex3_Car.getNumOfCar(),ex3_Car.getNumOfRedCar());
	}

}
