package project.bucket;

import java.util.ArrayList;
import java.util.Scanner;


public class GameManager implements IManager{
	
	static Scanner in = new Scanner(System.in);
	static ArrayList<Game>gameList = new ArrayList<>();
	static ArrayList<Game>wishList = new ArrayList<>();
//	BucketManager b = new BucketManager();
	
	public void addWishList() {
		boolean run = false;		
			check();
			do {
				System.out.println("=================================");
				System.out.println("구매하시려는 게임번호를 입력하세요");
				System.out.print("선택 번호 : ");
				String choice = in.nextLine();
				addBasket(choice);
				
			
							
					
				}while(run == true);
			System.out.println(wishList.size()+"개의 상품이 담겨있습니다.");
			System.out.println();
			for(Game w : wishList) {
				System.out.printf("%s %s %s %s\n",w.getProductID(),w.getProductName(),w.getProductGenre(),w.getPrice());
				System.out.println();
			}
		}
	
	
	
	void addBasket(String choice) {
		for (Game s: gameList) {
			if(s.productID.equals(choice)) {
				wishList.add(new Game(choice,s.productName,s.productGenre,s.price));
        		System.out.println("장바구니에 추가되었습니다.");
        		break;
				}
		}
	}
	public void basketRemoveAll() {
		
		System.out.println("장바구니를 초기화 하시겠습니까? Y/N");
		String selectYN = in.next();
		if(selectYN.toUpperCase().equals("Y")) {
			GameManager.wishList.clear();
			System.out.println("초기화 완료");
			
		}else if(selectYN.toUpperCase().equals("N")) {
			System.out.println("상위 매뉴로 돌아갑니다.");
			
		}
	}

@Override
public void add() {
	gameList.add(new Game("A01", "DiabloⅣ","MMORPG",39000));
	gameList.add(new Game("A02", "League of Legends","AOS",9000));
	gameList.add(new Game("A03", "OverWatch2","FPS",19000));
	gameList.add(new Game("A04", "BattleGround","FPS",29000));
	gameList.add(new Game("A05", "Dead by dead Light","Survival",15000));
}

@Override
public void remove() {
	String id;
	System.out.println("삭제 메뉴입니다.");
	System.out.println("삭제할 게임의 ID를 입력하세요");
	id = in.next();
	for(Game g : gameList) {
		if(g.productID.equals(id))
		gameList.remove(g);
		break;
		}
	System.out.println("삭제완료.");
	
}

@Override
public void check() {
	for (Game s: gameList) {
		System.out.printf("%s %s %s %s\n",s.getProductID(),s.getProductName(),s.getProductGenre(),s.getPrice());
	}
	
}

public void wishListadd() {
	wishList.add(new Game("A01", "DiabloⅣ","MMORPG",39000));
	wishList.add(new Game("A02", "League of Legends","AOS",9000));
	wishList.add(new Game("A03", "OverWatch2","FPS",19000));
	wishList.add(new Game("A04", "BattleGround","FPS",29000));
	wishList.add(new Game("A05", "Dead by dead Light","Survival",15000));
}
}

	
	       
	
	        