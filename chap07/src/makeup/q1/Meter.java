package makeup.q1;

public interface Meter {

	int BASE_PAY = 3000;
	public abstract void start();
	public abstract int stop(int distance);
	
}
