package ex1_string;

public class Ex1_CharAt {

	String pn = "8711271234567";
	char gender = pn.charAt(6);
	int length = pn.length();
	public void gender() {
		
		switch (this.gender) {
		case '1': case '3':
			System.out.println("남자");
			
			break;
			
		case '2': case '4':
			System.out.println("여자");
			break;
			
		}
		
	}
	public void idCheck() {
		if(this.length == 13) {
			System.out.println("주민등록번호 자리수가 맞습니다");
		}else {
			System.out.println("ㄴㄴ");
		}
	}
}
