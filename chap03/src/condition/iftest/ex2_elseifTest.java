package condition.iftest;

public class ex2_elseifTest {

	public static void main(String[] args) {
		int age = 10;
		int charge;
		
		if(age < 8) {
			charge = 450;
			System.out.println("미취학아동");
		}
		else if(age < 14 ) {
			charge = 900;
			System.out.println("초등학생");
		}
		else if(age < 20) {
			charge = 1000;
			System.out.println("청소년");
		}
		else {
			charge = 1250;
			System.out.println("성인");
		}
		
		System.out.println("요금은 "+charge+"원 입니다.");
	}

}
