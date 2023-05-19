package lamda;

public class AddTest {

	public static void main(String[] args) {
		AddT a2 = new AddT();
		Add a1 = (x,y) -> x+y;
		System.out.println(a1.add(5, 3));
	}

}
