package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ex1_ArrayList {

	public static void main(String[] args) {
		String[] arr = {"예지씨는","집에","가고싶다"};
		List<String> s = new ArrayList<>(Arrays.asList(arr));
		System.out.println(s);
		
		Stream<String> stream = s.stream();
//		stream.forEach(ss-> System.out.println(ss+" "));
//		stream.map(ss-> ss.length()).forEach(n->System.out.println(n.toString()));
		stream.filter(ss -> ss.length() > 3).forEach(n -> System.out.println(n));
		//파이프라인 에러는 변수이름을 통일시켜보자
	}

}
