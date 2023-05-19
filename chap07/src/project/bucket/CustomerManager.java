package project.bucket;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;



public class CustomerManager implements Manager {

	private static int serialID = 0;
	private static List<Customer> customerList = new ArrayList<>();
	private static String id = null;
	private static final String ADMIN_ID = "#mirinae";
	private static boolean isAdmin = false;
	private static boolean isLogin = false;

	public static int getSerialID() {
		return serialID;
	}

	static List<Customer> getCustomerList() {
		return customerList;
	}

	public static void setSerialID(int serialID) {
		CustomerManager.serialID = serialID;
	}

	static void setCustomerList(List<Customer> customerList) {
		CustomerManager.customerList = customerList;
	}

	static String getId() {
		return id;
	}

	static void setId(String id) {
		CustomerManager.id = id;
	}

	public static String getAdminId() {
		return ADMIN_ID;
	}

	public static boolean isAdmin() {
		return isAdmin;
	}

	public static void setAdmin(boolean isAdmin) {
		CustomerManager.isAdmin = isAdmin;
	}

	public static boolean isLogin() {
		return isLogin;
	}

	public static void setLogin(boolean isLogin) {
		CustomerManager.isLogin = isLogin;
	}

	@Override
	public void add() {

		Main.getScanner().nextLine(); // 버퍼 초기화 - Scanner로 int를 받다가 String으로 받으려면 초기화를 해야 함
		addCheck();
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addCheck() {

		String name, address, tel;
		boolean isExist = false;

		System.out.print("사용할 ID를 입력하세요 : ");
		id = Main.getScanner().nextLine();

		if (!customerList.isEmpty()) { // customerList가 비어있지 않다 == 중복되는 id값이 있을 가능성이 있음
			for (Iterator<Customer> iterator = customerList.iterator(); iterator.hasNext();) {
				Customer c = (Customer) iterator.next();
				if (c.getId().equals(id)) {
					isExist = true;
				}
			}
		}

		if (id.equals(ADMIN_ID)) {
			System.out.println("* 관리자 정보를 등록합니다. *");
		}

		if (!isExist) { // 중복값이 없으면 넣기
			System.out.print("이름을 입력하세요 : ");
			name = Main.getScanner().nextLine();
			System.out.print("주소를 입력하세요 : ");
			address = Main.getScanner().nextLine();
			System.out.print("전화번호를 입력하세요 : ");
			tel = Main.getScanner().nextLine();
			// Customer 인스턴스 생성
			Customer customer = new Customer(id, name, address, tel);
			customerList.add(customer);
			if (id.equals(ADMIN_ID)) {
				System.out.println("* 관리자 등록 성공 *");
			} else {
				System.out.println("회원 가입 성공");
			}
			System.out.println();
			id = null;
		} else { // 중복값이 있음
			System.out.println("입력하신 ID는 이미 존재하는 ID입니다.");
			System.out.println();
			id = null;
		}
	}

	@Override
	public void removeCheck() {
		// TODO Auto-generated method stub

	}

	public void login() {

		if (isLogin) {
			System.out.println("로그아웃 되었습니다.");
			System.out.println();
			isLogin = false;
			isAdmin = false;
		} else {
			Main.getScanner().nextLine(); // 버퍼 초기화
			System.out.print("ID를 입력하세요 : ");
			id = Main.getScanner().nextLine();
			loginCheck();
		}
	}

	public void loginCheck() {
		if (customerList.isEmpty()) {
			// 고객 리스트가 비어있음 == 무엇이 입력되든 등록되지 않은 사용자가 출력되어야 함
			System.out.println("등록되지 않은 사용자입니다.");
			System.out.println("다른 ID값을 입력하거나 회원가입을 진행해주세요.");
			System.out.println();
			id = null;
		} else {
			boolean isExist = false;
			String myName = null;
			for (Iterator<Customer> iterator = customerList.iterator(); iterator.hasNext();) {
				Customer customer = (Customer) iterator.next();
				if (customer.getId().equals(id)) {
					isExist = true;
					myName = customer.getName();
				}
			}
			if (isExist) {
				if (id.equals(ADMIN_ID)) {
					isAdmin = true;
					System.out.println("* 현재 관리자로 로그인되어 있습니다. *");
				}
				System.out.println(myName + "님, 환영합니다!");
				System.out.println();
				isLogin = true;
			} else {
				System.out.println("등록되지 않은 사용자입니다.");
				System.out.println("다른 ID값을 입력하거나 회원가입을 진행해주세요.");
				System.out.println();
				id = null;
			}
		}
	}

	public void main() {

		do {
			System.out.println("---- 로그인 메뉴 선택 ----");
			if (isLogin) {
				System.out.println("1. 로그아웃");
				System.out.println("2. (로그인 상태에서 회원 가입 불가)");
			} else {
				System.out.println("1. 로그인");
				System.out.println("2. 회원 가입");
			}
			System.out.println("3. 메인 메뉴로 이동");
			System.out.print(">> ");
			int decide = Main.getScanner().nextInt();

			switch (decide) {
			case 1:
				login();
				break;
			case 2:
				if (isLogin) {
					System.out.println("잘못된 입력값입니다. 다시 입력하세요.");
					System.out.println();
					break;
				} else {
					add();
					break;
				}
			case 3:
				return;
			default:
				System.out.println("잘못된 입력값입니다. 다시 입력하세요.");
				System.out.println();
				break;
			}

		} while (true);
	}

}
