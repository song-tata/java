package makeup.q7;

public interface UseInterface extends X , Y{
//	인터페이스 사이에서는 다중 상속이 가능
//	자바에서 다중 상속을 방지한 이유 > 모호함/안정성 이 떨어짐.!
//  
	void useMethod();
}
