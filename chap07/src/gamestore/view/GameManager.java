package gamestore.view;

import java.util.ArrayList;
import java.util.List;

import gamestore.model.Game;

public class GameManager implements Manager {

	private static List<Game> gameList = new ArrayList<>();
	private static List<Game> wishList = new ArrayList<>();

	public GameManager() {
		gameList.add(new Game("A01", "Diablo IV", "MMORPG", 39000));
		gameList.add(new Game("A02", "League of Legends", "AOS", 9000));
		gameList.add(new Game("A03", "OverWatch 2", "FPS", 19000));
		gameList.add(new Game("A04", "BattleGround", "FPS", 29000));
		gameList.add(new Game("A05", "Dead by Daylight", "Survival", 15000));
	}

	@Override
	public void add() { // gameList에 판매할 게임 추가

		if (CustomerManager.isAdmin()) {
			System.out.println("---- 게임 목록 추가 ----");
			addCheck();
		} else {
			System.out.println("현재 관리자로 로그인되어 있지 않습니다.");
		}
	}

	@Override
	public void remove() { // gameList에서 판매 중단할 게임을 제거

		if (CustomerManager.isAdmin()) {
			System.out.println("---- 게임 판매 중단 ----");
			removeCheck();
		} else {
			System.out.println("현재 관리자로 로그인되어 있지 않습니다.");
		}

	}

	@Override
	public void addCheck() {

		String productID;
		String productName;
		String productGenre;
		int price;
		boolean isExist = false;

		System.out.println("---- 현재 판매중인 게임 ----");
		check();
		Main.getScanner().nextLine(); // Flush;
		System.out.print("게임을 추가하시겠습니까? (Y/N) : ");
		String decide = Main.getScanner().nextLine();

		switch (decide) {
		case "Y":
		case "y":
			System.out.print("추가할 게임의 제품 ID 입력 : ");
			productID = Main.getScanner().nextLine();
			System.out.print("추가할 게임의 이름 입력 : ");
			productName = Main.getScanner().nextLine();
			System.out.print("추가할 게임의 장르 입력 : ");
			productGenre = Main.getScanner().nextLine();
			System.out.print("추가할 게임의 가격 입력 : ");
			price = Main.getScanner().nextInt();

			for (Game game : gameList) { // 기존에 존재하는 제품인지 확인
				if (game.getProductID().equals(productID)) {
					System.out.println("이미 존재하는 제품입니다.");
					System.out.println();
					isExist = true;
					break;
				}
			}

			if (!isExist) { // 기존에 존재하지 않을 경우에만 추가
				gameList.add(new Game(productID, productName, productGenre, price));
				System.out.println("추가가 완료되었습니다.");
				System.out.println();
			}
			break;
		default:
			System.out.println("취소합니다.");
			System.out.println();
			break;
		}
	}

	@Override
	public void removeCheck() {

		String productID;
		int removeIndex = -1;

		Main.getScanner().nextLine(); // Flush
		check();
		System.out.print("판매를 중단할 게임의 제품 ID를 입력하세요 : ");
		productID = Main.getScanner().nextLine();

		for (Game game : gameList) {
			if (game.getProductID().equals(productID)) {
				removeIndex = gameList.indexOf(game);
				break;
			}
		}

		if (removeIndex == -1) {
			System.out.println("일치하는 게임을 찾을 수 없습니다.");
			System.out.println();
		} else {
			Game g = gameList.get(removeIndex);
			System.out.println();
			System.out.println("---- 단종시킬 게임 정보 ----");
			System.out.printf("%s | %s | %s | %s%n", g.getProductID(), g.getProductName(), g.getProductGenre(),
					g.getPrice());
			System.out.print("위 상품을 판매 중단하시겠습니까? (Y/N) : ");
			String decide = Main.getScanner().nextLine();

			switch (decide) {
			case "Y":
			case "y":
				gameList.remove(removeIndex);
				System.out.println("입력한 제품이 단종 처리되었습니다.");
				System.out.println();
				break;
			default:
				System.out.println("취소합니다.");
				System.out.println();
				break;
			}
		}

	}

	public void check() {
		for (Game game : gameList) {
			System.out.printf("%s | %s | %s | %s%n", game.getProductID(), game.getProductName(), game.getProductGenre(),
					game.getPrice());
		}
	}

	public void addWishList() {
		boolean run = false;
		check();
		do {
			System.out.println("=================================");
			System.out.println("구매하시려는 게임번호를 입력하세요");
			System.out.print("선택 번호 : ");
			String choice = Main.getScanner().nextLine();
			addBasket(choice);

		} while (run == true);
		System.out.println(wishList.size() + "개의 상품이 담겨있습니다.");
		System.out.println();
		for (Game w : wishList) {
			System.out.printf("%s %s %s %s\n", w.getProductID(), w.getProductName(), w.getProductGenre(), w.getPrice());
			System.out.println();
		}
	}

	void addBasket(String choice) {
		for (Game s : gameList) {
			if (s.productID.equals(choice)) {
				wishList.add(new Game(choice, s.productName, s.productGenre, s.price));
				System.out.println("장바구니에 추가되었습니다.");
				break;
			}
		}
	}

	public void removeWishList() {

	}

	public static List<Game> getGameList() {
		return gameList;
	}

	public static List<Game> getWishList() {
		return wishList;
	}

	public static void setGameList(List<Game> gameList) {
		GameManager.gameList = gameList;
	}

	public static void setWishList(List<Game> wishList) {
		GameManager.wishList = wishList;
	}

	public void main() {

		if (CustomerManager.isAdmin()) { // 관리자면 게임 관리

			do {
				System.out.println("---- 게임 관리 ----");
				System.out.println("1. 판매할 게임 추가");
				System.out.println("2. 게임 판매 중단");
				System.out.println("9. 상위 메뉴로 이동");
				System.out.print(">> ");
				int decide = Main.getScanner().nextInt();

				switch (decide) {
				case 1:
					add();
					break;
				case 2:
					remove();
					break;
				case 9:
					return;
				default:
					break;
				}
			} while (true);

		} else { // 일반 사용자면 게임 구매

			do {
				System.out.println("---- 게임 구매 ----");
				System.out.println("1. 게임 구매");
				System.out.println("9. 상위 메뉴로 이동");
				System.out.print(">> ");
				int decide = Main.getScanner().nextInt();

				switch (decide) {
				case 1:
					// 게임 구매
					break;
				case 9:
					return;
				default:
					break;
				}
			} while (true);

		}
	}

}
