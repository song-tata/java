package staticex.upgrade;

public class Main {

	public static void main(String[] args) {
		Team A = new Team();
		Team B = new Team();
		Team C = new Team();
		
		A.useMoney(300);
		B.useMoney(500);
		C.useMoney(700);
		
		A.earmMoney(2000);
		B.earmMoney(100);
		C.useMoney(1000);
	}

}
