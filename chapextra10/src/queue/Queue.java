package queue;

public class Queue<E> implements QueueInterface<E> {

	private E[] queue;
	private int front, tail, capacity, index;

	public Queue(int capacity) {
		this.capacity = capacity;
		this.queue = (E[]) new Object[capacity];
		this.front = 0;
		this.index = 0;
		this.tail = capacity - 1;
	}

	@Override
	public void enqueue(E x) {
		if (isFull()) {
			System.out.println("queue is full");
		} else {
			tail = ((tail + 1) % capacity);
			queue[tail] = x;
			index++;
			System.out.println("들어감"+x);
		}
	}

	@Override
	public E dequeue() {
		if (isEmpty()) {
			return null;
		} else {
			E quefront = queue[front];
			front = (front + 1) % capacity;
			index--;
			
			return quefront;
		}
	}

	@Override
	public E front() {
		if (isEmpty())
			return null;
		else
			return queue[front];
	}

	@Override
	public boolean isEmpty() {
		return index == 0;
	}

	public boolean isFull() {
		return (index == capacity);
	}

	@Override
	public void dequeueAll() {
		this.queue = (E[]) new Object[queue.length];
		this.front = 0;
		this.index = 0;
		this.tail = queue.length - 1;
	}
	
	//큐의 값 확인 메서드
	public void printAll() {
//		for(E i : queue) {
//			System.out.println(i);
//		}
		int j = front;
		for(int i = 0; i < index; i++) {
			System.out.println(queue[j]);
			j= (j+1)%queue.length;
		}
		System.out.println();
	}
}
