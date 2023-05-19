package staticcheck;

public class StudentTest04 {

	public static void main(String[] args) {
		Student04 minsu = new Student04("민수");
		Student04 chulsu = new Student04("철수");
		Student04 a = new Student04();
		Student04 b = new Student04();
		
		System.out.println(a.cardNum);
		System.out.println(minsu.cardNum);
		System.out.println(chulsu.cardNum);
		System.out.println(b.cardNum);
	}

}
