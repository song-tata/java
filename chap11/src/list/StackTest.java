package list;

import java.util.Arrays;
import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		// LIFO : 후입선출 , 출입구가 한개
		// 스택은 삽입(push), 꺼내면서 삭제(pop) 
		String[] s = {"치킨","막국수","보쌈"};
		
		Stack<String> stack = new Stack<>();
		stack.push("파스타");
//		stack.push(s[0]);
//		stack.push(s[1]);
//		stack.push(s[2]);
		stack.addAll(Arrays.asList(s));
		System.out.println(stack.peek());
		//스택의 마지막 요소 보기
		stack.pop();//스택의 마지막 요소 버리기 보쌈 버림
		
		System.out.println(stack);
		
	}

}
