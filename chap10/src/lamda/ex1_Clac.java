package lamda;

public class ex1_Clac {

	public static void main(String[] args) {
		action((x,y) ->{
			int result = x+y;
			System.out.println("덧셈 :"+result);
		});
		action((int x,int y) ->{
			int result = x-y;
			System.out.println("뺄셈 :"+result);
		});
	}

	private static void action(Calc c) {
		int x = 10;
		int y = 5;
		c.calc(x, y);
	}

}

