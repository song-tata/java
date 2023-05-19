package ex1_inheritance;

public class A extends AB {

	public A() {
//		1.자식 기본생성자는 자동으로 부모의 기본 생성자 호출
		//super();
		//2.부모가 기본 생성자를 제공하지 않을 경우 직접 부모 생성자 호출
		super("str");
		
	}
	
	public void ma() {
		super.map();
		
		System.out.println("의 자식 A");
		
	}
	
}
