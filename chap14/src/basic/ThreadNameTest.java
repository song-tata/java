package basic;

public class ThreadNameTest {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread.getName()+" 실행");
		
		for(int i = 0; i< 3; i++) {
			Thread tA = new Thread() {
				@Override
				public void run() {
					System.out.println(getName()+ " 실행");
				}
			};
			tA.start();
		}
		
		Thread chatThread = new Thread() {
			@Override
			public void run() {
				System.out.println(getName()+ " 실행");
			}
		};
		chatThread.setName("chat");
		chatThread.start();
	}
	

}
