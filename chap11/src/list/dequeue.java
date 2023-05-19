package list;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.LinkedBlockingDeque;
//큐 : fifo 선입선출
//ArrayDeque와 Linkedlist 클래스로 구현
// (디큐)데큐 : 큐의 양쪽 끝에서 삽입과 삭제를 모두 허용하는 자료구조
// 스택 + 큐 -> deque
public class dequeue {

	public static void main(String[] args) throws InterruptedException {
		String[] s = { "손예진", "현빈", "송혜교" };
		LinkedBlockingDeque<String> deq = new LinkedBlockingDeque<>();
//		LinkedList<String> bt = new LinkedList<>();
		
		deq.addAll(Arrays.asList(s));
		deq.putLast("진");
		deq.putFirst("제이홉");
		
		deq.offerFirst(s[2]);//앞 출입구
		deq.offerLast(s[1]);//뒤 출입구
		
		System.out.println(deq.pollLast());
		System.out.println(deq.pollFirst());
		
//		System.out.println(deq.peek());
		
		Iterator<String> iterator = deq.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}

}
