package lamda;

public class MyNumberTest {

	public static void main(String[] args) {
		MyNumber m1 = (x, y) -> (x >= y)? x:y;
		
		System.out.println(m1.getMax(10, 20));
			
		
	}

}
