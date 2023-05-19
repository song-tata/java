package langs;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class BigIntegerDecimalTest {

	public static void main(String[] args) {
//		long a = 1000000000000000000L;
		//큰 정수 계산 자료형
		//BigInteger 매우매우 큰 정수 자료형
		int a = 100000000*10000000;
		System.out.println(a);//논리적 오류 발생
		
		BigInteger b1 = new BigInteger("1000000000000000000000000000000");
		BigInteger b2 = new BigInteger("2000000000000000000000000000000");
		BigInteger r = b1.add(b2);
		System.out.println(r);
		System.out.println(r.toString());
		System.out.println(b1.add(b2));
		r = b1.multiply(b2);
		System.out.println(r);
		r = b1.subtract(b2);
		
		System.out.println("-".repeat(10));
		
		// double 형에서는 값이 손실, 정확한 값이 나오지않는 경우 발생.
		// 산술 연산자 대신에 메소드를 사용하는게 정확한 값을 반환할수있다.
		double e1 = 1.6;
		double e2 = 0.1;
		System.out.println(e1+e2);
		BigDecimal be1 = new BigDecimal("1.6");
		BigDecimal be2 = new BigDecimal("0.1");
		System.out.println(be1.add(be2));
		//컴퓨터가 바이트단위의 계산을 하기 때문에 값손실이 발생.
		// 소수 이하 자리수 7개까지 출력
		BigDecimal re = be1.divide(be2,MathContext.DECIMAL32);
		System.out.println(re);
		
		
	}

}
