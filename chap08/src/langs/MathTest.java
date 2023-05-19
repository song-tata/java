package langs;

import java.util.UUID;

public class MathTest {

	public static void main(String[] args) {
		System.out.println(Math.abs(-5));//절대값
		System.out.println(Math.ceil(1.2));// 소수 이하의 수 존재하면 올림.
		System.out.println(Math.round(1.5));//소수 반올림
		System.out.println(Math.floor(1.2));// 소수이하의 수를 내림
		System.out.println(Math.pow(2, 6));//2의 6제곱
		System.out.println(Math.random());//난수 발생(0.0~0.99999)생성
		// 시리얼키, 임시 비밀번호, 인증번호 등 난수 발생
		String uuid = UUID.randomUUID().toString();//고유 식별자.
		System.out.println("임시비밀번호 | "+uuid.split("-")[0]);
		
	}

}
