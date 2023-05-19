package list;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		//10개의 값을 저장할 수 있는 가변배열 선언
		Vector<String> v = new Vector<>();
		//백터의 크기를 반환해주는 메소드
		System.out.println(v.capacity());// 10
		//저장 공간 부족시 10개의 저장공간을 자동 추가(현재 저장공간 *2)
		for(int i = 0; i <15; i++) {
			v.add("lee");
		}
		System.out.println(v.capacity());//저장 공간의 갯수
		System.out.println(v.size());//저장한 요소의 갯수
		System.out.println(v.get(0));
		
		v.trimToSize();//유효하지않은 저장공간 삭제
		System.out.println(v.capacity()+"삭제후");
		for(int i = 0; i <6; i++) {
			v.add("kim");
		}
		System.out.println("6개 추가"+v.capacity());
		v.trimToSize();
		System.out.println(v.capacity()+"삭제후2");
		
	}

}
