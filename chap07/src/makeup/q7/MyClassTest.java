package makeup.q7;

public class MyClassTest {

	public static void main(String[] args) {
		//객체의 자료형을 여러개로 사용해야 할 때 다중상속
		MyClass m1 = new MyClass();
		X x = new MyClass();
		Y y = new MyClass();
		UseInterface u = new MyClass();
		
		m1.useMethod();
		m1.x();
		m1.y();
		
		x.x();
				
		y.y();
		
		
		u.x();
		u.y();
		u.useMethod();
		
		if(u instanceof X) {
			UseInterface m2 = (UseInterface) x;
			System.out.println("바뀜?");
		}else {
			System.out.println("ㄴㄴ?");
		}
		
	}

}
