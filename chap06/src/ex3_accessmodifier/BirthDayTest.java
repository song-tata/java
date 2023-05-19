package ex3_accessmodifier;

public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay b1 = new BirthDay();
		
		b1.setDay(10);
		b1.setMonth(77);
		b1.setYear(2019);
		
		b1.showDate();
	}

}
