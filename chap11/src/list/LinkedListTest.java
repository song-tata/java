package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// ArrayList : 참조 조회 중심, 대량의 데이터를 일괄적으로 추가해서 처리
		// LinkedList : 중간에 삽입, 삭제 빈번하게 발생하는 경우 사용.
		// LinkedList는 앞뒤를 연결하는 2개의 링크 존재

		LinkedList<String> ll = new LinkedList<>();
		ll.get(0);
		ArrayList<String> key = new ArrayList<>();
		
		key.get(0);
		
		
		
		String[] s = { "손예진", "현빈", "송혜교" };
		ll.addAll(Arrays.asList(s));
		ll.add(0, "김지은");
		ll.remove(2);

		// iterator : 반복자 (한번 사용가능)
		Iterator<String> iterator = ll.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
//		iterator 를 재사용 하려면 다시 선언해야한다.
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
