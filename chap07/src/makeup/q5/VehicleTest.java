package makeup.q5;

public class VehicleTest {

	public static void main(String[] args) {
		//업케스팅(묵시적 형변환)
		IVehicle vehicle = new Bus();
		
		vehicle.roll();
		//다운케스팅(명시적 형변환)
//		vehicle.checkFare(); > 안댐!!
		Bus bus = (Bus) vehicle;
	}

}
