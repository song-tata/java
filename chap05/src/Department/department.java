package Department;

import java.util.ArrayList;
import java.util.Scanner;

public class department {
	static ArrayList<Store> stores = new ArrayList<>();
	Scanner input = null;
	Store store = null;
	// 메뉴1 메소드
	public department() {
		input = new Scanner(System.in);
			
		}
	
	public void insertStore(String name, String location, String type) {
		Scanner in = new Scanner(System.in);
		System.out.println("입력할  매장의 이름은: ");
		this.getInput().nextLine();
		System.out.println("입력할  매장의 위치는: ");
		this.getInput().nextLine();
		System.out.println("입력할  매장의 종류는: ");
		this.getInput().nextLine();
		for (Store s:stores) {
			if (isSame(name)) {
				System.out.println("이미 등록된 이름입니다.");
			}else createStore(name, location, type);
			}//중복을 체크할 메소드 필요
		
		//배열에 넣을 메소드
	}
	public static void createStore(String name, String location, String type) {
		Store newstore = new Store(name, location, type);
		stores.add(new Store(name, location, type));
	}
	public static boolean isSame(String name) {
		boolean result = false;
		if (Store.getName().equals(name))
			result = true;
		return result;
		
	}	public Scanner getInput() {
		return input;
	}

	public void setInput(Scanner input) {
		this.input = input;
	}
	
	
//	public void checkStore() {
//		// 추가된 스토어가 없다면
//		if (!this.hasStore()) {
//			System.out.println("등록된 매장이 없습니다.");
//			return; // 메서드 종료
//		}else {
//			System.out.println("매장 이름: "+this.getStore().getName());
//		}
//	}
//	
//	public static void editStore(){
//		Store.getName();
//		String name = department.
//		for (Store s: stores) {
//			if(s.getName().equals(name)) {
//				department.
//			}
//		}
//		
//	}
	public boolean hasStore() {
		return store != null;
	}
}