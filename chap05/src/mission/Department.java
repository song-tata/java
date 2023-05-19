package mission;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {
	Scanner i = null;		
	ArrayList<Store> stores = null;
	//store 클래스 선언
	
	public Department() {
		i = new Scanner(System.in);
		stores = new ArrayList<>();
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
		
//		this.setS(new Store(name, storeCase, rocation));
//		System.out.println("입력이 완료되었습니다.");
		//입력받은 변수들 store 새로 만들어서 대입
	}
	
	public void checkStore() {
		if(!this.getStores().isEmpty()) {
			System.out.println("등록된 매장이 없습니다.");
			return;
		}else {
			for(Store i : this.getStores()) {
				System.out.println(i.showInpo());
			}
		}
	}
	public boolean hasStore() {
		return stores != null;
	}
	public Scanner getI() {
		return i;
	}

	public ArrayList<Store> getS() {
		return stores;
	}

	public void setI(Scanner i) {
		this.i = i;
	}

	public void setS(ArrayList<Store> s) {
		this.stores = s;
	}

	public ArrayList<Store> getStores() {
		return stores;
	}

	public void setStores(ArrayList<Store> stores) {
		this.stores = stores;
	}
		
	
}
