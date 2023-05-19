package project.bucket;

import java.util.Scanner;

public class BucketManager implements IManager {

	Scanner in = new Scanner(System.in);

	static int gameKindsCount = 0;

	GameManager g = new GameManager();

	@Override
	public void add() {
		// TODO Auto-generated method stub

	}

	@Override
	public void remove() {
		String id;
		System.out.println("삭제 메뉴입니다.");
		showbasket();
		System.out.println("삭제할 ID입력하세요");
		id = in.next();
		for (Game g : GameManager.wishList) {
			if (g.productID.equals(id))
				GameManager.wishList.remove(g);
			break;
		}
		System.out.println("삭제완료.");
		showbasket();
	}

	@Override
	public void check() {
	}

	public void removeAll() {
		showbasket();
		System.out.println("장바구니를 초기화 하시겠습니까? Y/N");
		String selectYN = in.next();
		if (selectYN.toUpperCase().equals("Y")) {
			GameManager.wishList.clear();
			System.out.println("초기화 완료");

			showbasket();

		} else if (selectYN.toUpperCase().equals("N")) {
			System.out.println("상위 메뉴로 돌아갑니다.");

		}

	}

	public void showbasket() {
		System.out.println("장바구니에 담긴 상품을 출력합니다.");
		for (Game g : GameManager.wishList) {
			System.out.printf("%s | %10s | %15s | %24d 개 | %d\n ", g.productName, g.productID, g.productGenre, g.count,
					g.price);
			gameKindsCount++;

		}
		System.out.println(gameKindsCount + " 종류의 게임이 담겨있습니다.");
		System.out.println("상품의 종류 : " + gameKindsCount);
		gameKindsCount = 0;

	}

	public void purchase() {
		int sum = 0;
		String menu;
		System.out.println("구매 목록: ");
		showbasket();
		for (Game g : GameManager.wishList) {
			sum += g.price;
		}
		System.out.printf("가격: %d\n", sum);
		System.out.println("구매하시겠습니까? Y/N");
		menu = in.next();
		if (menu.toUpperCase().equals("Y")) {
			System.out.println("배송지 입력 페이지로 이동합니다.");
			sippingAddress();
		} else if (menu.toUpperCase().equals("N")) {
			System.out.println("상위 메뉴로 돌아갑니다.");
		}
	}

	public void sippingAddress() {
		String menu;
		String address = null;
		System.out.println("고객님의 주소로 배송합니까?Y/N");
		menu = in.next();
		if (menu.toUpperCase().equals("Y")) {
//			선락씨 코드에서 주소 가져오기
//			if(CustomerManager.isLogin())
//				{
//				for(Customer c : CustomerManager.customerList ) {
//					address = c.getAddress();
//					break;
//				}

			System.out.println(address + "로 배송됩니다.");
			System.out.println("구매해주셔서 감사합니다");
//			}	

		} else if (menu.toUpperCase().equals("N")) {
			System.out.println("새 배송지 입력:");
			address = in.next();
			System.out.printf("%s로 배송됩니다.\n", address);
			System.out.println("구매해주셔서 감사합니다");
		}
	}

	public void main() {
		boolean run = true;
		int menu;

		System.out.println("장바구니 메뉴입니다.");
		showbasket();
		while (run) {
			System.out.println("1. 장바구니 수정 2. 구매 3. 상위 메뉴로");
			menu = in.nextInt();
			switch (menu) {
			case 1:
				boolean subrun = true;
				int submenu;
				while (subrun) {
					System.out.println("수정 메뉴입니다.");
					System.out.println("1. 개별 삭제 2. 전체 삭제 3.상위메뉴로");
					submenu = in.nextInt();
					if (submenu == 1) {
						remove();
					} else if (submenu == 2) {
						removeAll();
					} else if (submenu == 3) {
						System.out.println("상위 메뉴로 이동합니다.");
						subrun = false;
					} else {
						System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
					}
				}
				break;
			case 2:
				purchase();
				run = false;
				break;
			case 3:
				return;

			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
				break;
			}
		}
	}

}
