package ex1_string;

public class Ex6_Replace {
	
	String oldStr = "자바 문자열은 불변. 자바 문자열은 String 사용";
	
	String newStr = oldStr.replace("자바", "java");

public void printString() {
	
	System.out.println(this.oldStr);
	System.out.println(this.newStr);
	
}
}
