package makeup.q6;

public class Taxi implements IVehicle{

	@Override
	public void roll() {
		System.out.println("택시 출발!");
		
	}
	public void checkFare() {
		System.out.println("택시 요금 체크");
	}
}
