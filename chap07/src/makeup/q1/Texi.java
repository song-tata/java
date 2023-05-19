package makeup.q1;

public class Texi implements Meter{
	int BASE_PAY = 2500;
	
	@Override
	public void start() {
		System.out.println("운행을 시작합니다.");
	}

	@Override
	public int stop(int distance) {
		int pay = BASE_PAY;
		if(distance >= 200)
			pay += distance*20;
				
		return pay;
	}

}
