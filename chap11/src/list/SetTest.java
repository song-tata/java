package list;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

	public static void main(String[] args) {
		// Set : 고유값(ex : 아이디, 시리얼넘버, 로또 ) 저장.
		// 중복을 입력하더라도 내부적으로 한개만 저장 특성
		// 따라서 자료값 자체가 고유함 > '식별자' -> 인덱스 없음
		// 순서가 비정렬상태

//		Set<String> set2 = new HashSet<>();

		// TreeSet : 오름정렬
		Set<String> set = new TreeSet<>();
		set.add("루피");
		set.add("강백호");
		set.add("이누야샤");
		set.add("etc");
		set.add("500");
		System.out.println(set);

		// 검색, 추가, 삭제 연산을 빠른 시간(상수시간: 0(1) )안에 처리  가능
		// 중복 x, 비정렬, null 허용(한개만 허용)
		//Hash 붙은 태그는 검색에 사용
		Set<String> set2 = new HashSet<>();
		set2.add("루피");
		set2.add("강백호");
		set2.add("이누야샤");
		set2.add("etc");
		set2.add("500");
		System.out.println(set2);
	}

}
