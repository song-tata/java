package ex1_inheritance.bb;
// 패키지 별로 기능을 쪼갤거!
//다른 패키지에서 기능을 가져올 때 아래 처럼 선언해줘야함
import ex1_inheritance.aa.AAA;
//import ex1_inheritance.aa.*;
public class BBB extends AAA {
	
	public BBB() {
		super.num++;
		System.out.println(num);
	}
}
