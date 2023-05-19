package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;
import java.util.stream.IntStream;

/*
 * 스트림의 모든 요소를 반복하면서 하나의 결과를 계산하기 때문에 최종 연산 중 하나.
 * 스트림의 최종연산은 for each 와 reduce를 주로 사용
 */
class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String t, String u) {
		if (t.getBytes().length >= u.getBytes().length)
			return t;
		else
			return u;
	}

}

public class Reduce {

	public static void main(String[] args) {
		String[] greetings = {
				"안녕하세요","코로나 조심하세요~"," 좋은 아침"
				, "곧 점심","abcdefghijklmnop"
		};
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		
		
		
		// range() : 수열(여러개의 숫자)을 만들어줌
		// reduce() :
		int sum = IntStream.range(1, 6).reduce(0, (a, b) -> a + b);
		System.out.println(sum);

	}

}
