package list;

public class LinkedListDemo {
	public static void main(String[] args) {
		System.out.println("Linked List Demo!");
		LinkedList<Integer> list = new LinkedList<>();
		list.add(0, 300); // 오토 박싱
		list.add(0, 200);
		list.add(0, 100);
		list.printAll();
		System.out.println();
		list.append(500);
		list.append(600);
		list.printAll();
		System.out.println();
		list.remove(3);
		list.printAll();
		System.out.println();
		list.add(3, 250);
		list.add(1, 50);
		list.add(0, 10);
		list.printAll();
		System.out.println();
		list.append(700);
		list.printAll();
		System.out.println();
		list.remove(1);
		list.removeItem(600);
		list.printAll();
		System.out.println();
	}
} // 코드 5-10