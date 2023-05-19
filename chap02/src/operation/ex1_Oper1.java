package operation;

public class ex1_Oper1 {

	public static void main(String[] args) {
		// 동일 자료형 변수는 한번에 여러개 선언 가능
		int a = 20, b = 7, c = a+b;
		System.out.println(c);
		
		// 1.234567891234568오차범위 발생
		double d = 1.23456789123456789; 
		System.out.println(d);
		
		int e = (int)d*100; // d는 int형으로 바뀌어서 1이 됨
		System.out.println(e);
		
		//복합대입 연산자
		int i = 0;
		i += 2;
		i = +1; //양수 1 대입
		i = -1; //음수 1 대입
		System.out.println(i);
	}

}
