package langs;


/**
 * JDK1.5부터 오토박싱과 언박싱이 가능해짐 instanceof 연산자
 * @author keduit
 *
 */
public class WrapperTest {

	//Wrapper 객체 자료형(참조형) <-> 기본 자료형 자동포장
	//o 에 전달된 자식 인스턴스의 클래스형 조사
	public static void m(Object o) {
		if(o instanceof Integer) { //o에 전달된 자식 인스턴스의 클래스형이 Integer 정수형 이면
			Integer i = (Integer) o;// 박싱,자료형 변환
			System.out.println("int"+i);
	
		}else if (o instanceof Double) {
			Double d = (Double) o;
			System.out.println("double"+d);
		}
	}
	public static void main(String[] args) {
		m(1);
		m(3.123);
		
		int i = Integer.parseInt("123");
		System.out.println(i+7);
//		알파벳(한글 포함 여부)
		System.out.println(Character.isAlphabetic('a'));
//		숫자 여부
		System.out.println(Character.isDigit('5'));
		
		String pw = "avc?123";
		boolean isRight = true;
		for(int j = 0; j<pw.length(); j++) {
			char ch = pw.charAt(j);
			if(!Character.isAlphabetic(ch) && !Character.isDigit(ch)) {
				isRight = false;
				break;
			}
		}
		System.out.println(isRight ? "사용가능":"사용불가능");
	}

}
