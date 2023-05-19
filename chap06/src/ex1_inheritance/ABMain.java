package ex1_inheritance;

public class ABMain {

	public static void main(String[] args) {
		A aObj1 = new A();
		A aobj2 = new A();
		
//		aObj.ma();
//		aObj.map();
//		부모 객체로 배열 선언
		AB[] ab = new AB[2];
//		자식 객체로 배열 선언
//		A[] a = new A[2]; < 이거도 가능함!
		
		ab[0] = aObj1;
		
		ab[1] = aobj2;
		
		for(AB i : ab) {
			i.map();
		}
	}

}
