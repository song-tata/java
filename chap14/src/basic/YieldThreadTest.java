package basic;

public class YieldThreadTest extends Thread {
	public static boolean work = true;
	
	public boolean isWork() {
		return work;
	}

	public void setWork(boolean work) {
		this.work = work;
	}

	//생성자
	public YieldThreadTest(String name) {
		setName(name);
	}
	
	//스레드 기능 구현
	@Override
	public void run() {
		while(true) {
			if(work) {
				System.out.println(getName()+"작업 중");
			}else {
				Thread.yield(); // 동일한 우선순위의 스레드에게 작업 양보
			}
		}
	}
}
