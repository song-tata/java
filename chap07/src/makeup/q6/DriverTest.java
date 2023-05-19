package makeup.q6;

public class DriverTest {

	public static void main(String[] args) {
		IVehicle bus1 = new Bus();
		IVehicle taxi1 = new Taxi();
		IVehicle airplane = new Airplane();
		
		Driver driver1 = new Driver();
		Driver driver2 = new Driver();
		Driver driver3 = new Driver();
		Driver driver4 = new Driver();
		driver1.drive(taxi1);
		driver2.drive(bus1);
		driver3.drive(null);
		driver4.drive(airplane);
	}

}
