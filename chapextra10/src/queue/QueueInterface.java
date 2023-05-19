package queue;

public interface QueueInterface<E> {
	//맨 끝에 원소 추가
	public void enqueue(E x);
	//맨 앞의 원소 삭제
	public E dequeue();
	//맨 앞의 원소 보여주기
	public E front();
	//큐가 비었는지 체크
	public boolean isEmpty();
	//큐 전체 비우기
	public void dequeueAll();
}
