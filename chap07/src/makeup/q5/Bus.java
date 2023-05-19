package makeup.q5;

public class Bus implements IVehicle{

	@Override
	public void roll() {
		System.out.println("버스 출발!");
		
	}
	public void checkFare() {
		System.out.println("버스 요금 체크");
	}
	
}
