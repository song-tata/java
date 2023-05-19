package ex1_string;

public class Ex4_Index {

	public static void main(String[] args) {
		String subject = "자바프로그래밍 과정";
		//시작위치를 알아내면 잘라낼 수 있다
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		String substring = subject.substring(location);
		System.out.println(substring);
		//indexof의 경우 찾는 단어가 존재하지않는 경우 
		//-1을 반환하는 메서드
		System.out.println("시작 끝인덱스 : "+subject.substring(0, 3));
		
		location = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바관련책");
		}else {
			System.out.println("자바관련책아님");
		}
	}

}
