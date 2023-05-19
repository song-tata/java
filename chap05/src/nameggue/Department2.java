package nameggue;

import java.util.Scanner;

public class Department2 {
	Scanner input = null;
	Store store = null;
	
	public Department2() {
		input = new Scanner(System.in);
	}
    
	public void inputStore() {
		System.out.print("매장 명: ");
		this.getInput().nextLine(); // 버퍼 초기화
		String name = this.getInput().next();
		System.out.print("매장 종류: ");
		this.getInput().nextLine(); // 버퍼 초기화
		String type = this.getInput().next();
		System.out.print("매장 위치: ");
		this.getInput().nextLine(); // 버퍼 초기화
		String pos = this.getInput().next();
		
		this.setStore(new Store(name, type, pos)); // Store 객체 생성.
		System.out.println("입력이 완료 되었습니다.");
	}
	
	public void checkStore() {
		// 추가된 스토어가 없다면
		if (!this.hasStore()) {
			System.out.println("등록된 매장이 없습니다.");
			return; // 메서드 종료
		}else {
			System.out.println("매장 이름: "+this.getStore().getName());
		}
	}
	
	public boolean hasStore() {
		return store != null;
	}

	public Scanner getInput() {
		return input;
	}

	public Store getStore() {
		return store;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}

	public void setStore(Store store) {
		this.store = store;
	}
	
	
}
