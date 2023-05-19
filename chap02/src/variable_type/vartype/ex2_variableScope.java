package variable_type.vartype;

public class ex2_variableScope {

	public static void main(String[] args) {

		int i = 0;
		System.out.println("함수 호출 전 :" + i);
		change(i);
		System.out.println("함수 호출 후 :" + i);
	}
	
	public static void change(int i) {
		i = 10;
		System.out.println("change 내부 :" + i);
	}
}
