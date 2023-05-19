package chapextra10;

public class Stack2 {
	private int[] stack;
	private int topIndex;
	private int capacity;

	public Stack2(int capacity) {
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
		if (isEmpty()) {
			System.out.println("stack empty");

		} else {
			System.out.println(stack[topIndex--]);
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
		stack = new int[capacity];
		topIndex = -1;
	}
}
