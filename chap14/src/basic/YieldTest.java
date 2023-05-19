package basic;

public class YieldTest {

	public static void main(String[] args) {
		YieldThreadTest t1 = new YieldThreadTest("스레드 A");
		YieldThreadTest t2 = new YieldThreadTest("스레드 B");
		t1.start();
		t2.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {}
			YieldThreadTest.work = false;
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {}
			YieldThreadTest.work = true;
		
	}

}
