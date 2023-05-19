package sync;

public class Study {
	// Synchronized : 동기화 공유 인스턴스
	// 순서대로 순차 처리 구조
	String tool = "연필"; // 학원용 연필(학생들이 공유)
	int num;
	
	synchronized void mat(String name) {
		num++;
		System.out.println(name +"이 "+tool+"로 공부 시작");
		for(int i = 0; i < 100; i++) {
			System.out.println(name +"이 "+tool+"로 열공중");
		}
		System.out.println(name +"이 "+tool+"로 공부 끝");
	}
}
