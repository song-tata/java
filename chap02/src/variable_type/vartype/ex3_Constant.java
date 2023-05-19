package variable_type.vartype;

public class ex3_Constant {

	public static void main(String[] args) {
		//상수 : 선언 이후 코드 내에서 변하지 않아야 하는 수
		//ex) 12달, 24시간, 로그인 횟수제한등
		final int MAX_NUM = 100;// 상수 선언, 초기화
		System.out.println(MAX_NUM);
		//에러 발생
		//MAX_NUM = 80;
		
	}
}
