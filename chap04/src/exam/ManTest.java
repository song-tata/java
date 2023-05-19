package exam;

public class ManTest {

	public static void main(String[] args) {
		Man first = new Man();
		Man second = new Man(10, true);
		Man third = new Man("김김김");
		
		first.age = 30;
		System.out.println(second.isMarried);
		
	}

}
