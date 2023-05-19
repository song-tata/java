package basic;

public class SumThreadTest {

	public static void main(String[] args) {
		SumThread st = new SumThread();
		st.start();
		try {
			st.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(st.getSum());
	}

}
