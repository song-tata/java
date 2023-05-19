package variable;

public class Ex2_Exchange {

	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		//임시 변수 선언

		System.out.println("x:"+x+"y:"+y);
		int temp = x;
		
		
		x = y;
		y = temp;
		System.out.println("x:"+x+"y:"+y);
		
	}

}
