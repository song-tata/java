package ex1_inheritance.bb;

import ex1_inheritance.aa.AAA;

public class Main {
	
	public static void main(String[] args) {
		
		AAA a = new AAA();
		//자식이 부모의 필드를 변경하더라도 부모 필드값은 유지.
		//부모와 자식은 독립적
		System.out.println(a.getNum());
		BBB b = new BBB();
	}

}
