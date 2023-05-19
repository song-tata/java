package exam2;

import java.util.Scanner;

public class DefStore {
	Scanner i = null;		
	Store s = null;
	//store 클래스 선언
	
	public DefStore() {
		i = new Scanner(System.in);
	}
	
	public void inputStore() {
		System.out.println("매장명: ");
		this.getI().nextLine(); //버퍼 초기화
		String name = this.getI().next();
		//store의 storeName 입력받음
		
		System.out.println("매장종류: ");
		this.getI().nextLine(); //버퍼 초기화
		String storeCase = this.getI().next();
		System.out.println("매장위치: ");
		this.getI().nextLine(); //버퍼에 있는 값을 날려주겠다. 버퍼 초기화
		String rocation = this.getI().next();
		
		this.setS(new Store(name, storeCase, rocation));
		System.out.println("입력이 완료되었습니다.");
		//입력받은 변수들 store 새로 만들어서 대입
	}
	
	public void checkStore() {
		if(!this.hasStore()) {
			System.out.println("등록된 매장이 없습니다.");
			return;
		}else {
			System.out.println("매장이름: "+this.getS().getStoreName());
		}
	}
	public boolean hasStore() {
		return s != null;
	}
	public Scanner getI() {
		return i;
	}

	public Store getS() {
		return s;
	}

	public void setI(Scanner i) {
		this.i = i;
	}

	public void setS(Store s) {
		this.s = s;
	}
		
	
}
