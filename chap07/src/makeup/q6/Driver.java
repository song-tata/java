package makeup.q6;

public class Driver {
	//어떤 종류의 자동차를 운전 할 수 있는지 체크
	public void drive(IVehicle vehicle) {
		if(vehicle instanceof Bus) {
			Bus bus1 = (Bus)vehicle;
			bus1.roll();
			bus1.checkFare();
		}else if(vehicle instanceof Taxi) {
			Taxi taxi1 = (Taxi)vehicle;
			taxi1.roll();
			taxi1.checkFare();
		}else {
			System.out.println(vehicle+"운전기사가 존재하지않습니다.");
		}
	}
}
