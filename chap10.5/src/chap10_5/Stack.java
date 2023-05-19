package chap10_5;

public class Stack {
	private int[] stack;
	private int topIndex;
	private int capacity;

	public Stack(int capacity) {
		this.capacity = capacity;
		stack = new int[capacity];
		topIndex = -1;
	}

	public void push(int x) {
		if (topIndex == capacity - 1) {
			System.out.println("스택이 가득찼습니다");
		} else {
			stack[++topIndex] = x;
		}
	}

	public void pop() {
		if (!isEmpty()) {
			top();
			stack[topIndex] = 0;
			topIndex--;
		} else {
			System.out.println("스택이 비어있습니다.");
		}
	}

	public void top() {
		System.out.println("스택의 맨 위에 있는 원소");
		System.out.println(stack[topIndex]);
	}

	public boolean isEmpty() {
		boolean flag = false;
		if (topIndex == -1)
			flag = true;
		return flag;
	}

	public void popAll() {
		for (int i = topIndex; i < -1; i--) {
			pop();
		}
		System.out.println("스택을 비웠습니다.");
		topIndex = -1;
	}
}
