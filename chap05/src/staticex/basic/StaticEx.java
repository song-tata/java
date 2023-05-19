package staticex.basic;

class Test{
	public static String classVar = "나는 클래스 변수";
	public String a = "나는 인스턴스 변수";//생성될 때 힙에 할당
	
	public void istansmethod() {
		System.out.println(classVar);
		System.out.println(a);
	}
	public static void classmethod() {
		System.out.println(classVar);
//		System.out.println(a);
	}

}
public class StaticEx {

	public static void main(String[] args) {
		
		
		System.out.println(Test.classVar);
//		System.out.println(Test.a);
		
		Test.classmethod();
//		Test.istansmethod();
		
		
		
		Test t1 = new Test();
		Test t2 = new Test();
		t1.classVar = "나는 t1의 클래스 변수";
		t1.a = "t1의 인스턴스변수";
		t2.a = "t2의 인스턴스변수";
		t1.istansmethod();
		System.out.println(t1.a);
		System.out.println(t2.a);
		t1.classmethod();
		
		Test.classmethod();
	}

}
