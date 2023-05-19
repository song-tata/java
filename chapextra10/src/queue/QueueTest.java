package queue;

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> q = new Queue<>(3);

		q.enqueue(10);
		q.enqueue(202);
		q.enqueue(20);

		System.out.println(q.front());
		System.out.println(q.dequeue());

		q.enqueue(60);
		q.enqueue(80);
		System.out.println("나옴"+q.dequeue());
		q.enqueue(1);
		q.printAll();
	}

}
