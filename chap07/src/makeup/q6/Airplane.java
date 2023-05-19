package makeup.q6;

public class Airplane implements IVehicle {
	@Override
	public void roll() {
		System.out.println("비행기 출발!");
		
	}
	public void checkFare() {
		System.out.println("비행기 요금 체크");
	}
}
