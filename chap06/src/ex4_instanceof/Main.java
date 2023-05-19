package ex4_instanceof;


public class Main {

	public static void main(String[] args) {
		Texi taxi = new Texi();
		Bus bus = new Bus();
		
		ride(taxi);
		ride(bus);
		
		
	}
	
	public static void ride(Vehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			System.out.println("ok");
		}else {
			System.out.println("no");
			}
		vehicle.run();
	}

}
