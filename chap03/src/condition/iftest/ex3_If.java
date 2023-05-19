package condition.iftest;

public class ex3_If {

	public static void main(String[] args) {
		//문자열 비교 연산
		//== 숫자형태만 비교가능 
		String name1 = "python";
		String name2 = "python";
		
		//equals() 를 쓰는게 바람직하다
		//변수명.equals(비교할 변수)
		if(name1 == name2) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
	}

}
