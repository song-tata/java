package chapextra10;

public class ListStack {
	int[] stack;
	int topIndex = 0;

	public static void main(String[] args) {
	}

	public void push(int x) {
		stack[top()] = x;
	}

	public void pop() {
		System.out.println(stack[top()] + " 가 제일 위에 담겨있습니다. ");
		stack[top()] = 0;
		topIndex--;
	}

	public int top() {
		for (int a : stack) {
			
			topIndex++;
		}
		return topIndex;
	}

	public boolean isEmpty() {
		boolean flag = false;
		if (topIndex == 0)
			flag = true;
		return flag;
	}

	public void popAll() {
		int[] stack;
		topIndex = 0;
	}
}
