package inheritence;

public class B extends AB{
	// 새 메소드 선언 및 정의 x
	//부모의 메소드를 재정의한것
	@Override
	public void draw() {
		System.out.println("B글자 그리기");
	}

}
