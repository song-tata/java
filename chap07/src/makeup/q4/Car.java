package makeup.q4;

public class Car {

	ITire rf = new GumhoTire();
	ITire lf = new HankukTire();
	ITire rb = new HankukTire();
	ITire lb = new GumhoTire();
	
	public void Drive() {
		rf.roll();
		lf.roll();
		rb.roll();
		lb.roll();
	}
	
}
