package getset;

public class CarTest {

	public static void main(String[] args) {
		Car myCar = new Car();
//		myCar.speed = -50;
//		System.out.println("현재속도: "+myCar.speed);
		
		myCar.setSpeed(-50);
		myCar.getSpeed();
		System.out.println(myCar.getSpeed());
		System.out.println("주행상황 "+(myCar.isStop()? "운전중":"주차"));
		}

}
