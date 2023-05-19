package departments;



public class DepartTest {

	public static void main(String[] args) {

		Department d = new Department();
		
		int menu = 0;
		
		
		while(true) {
			System.out.println(" 메뉴 ");
			System.out.println("1. 매장 입력 ");
			System.out.println("2. 매장 관리 ");
			System.out.println("3. 매장 확인 ");
			System.out.println("4. 종료 ");
			System.out.println(" 메뉴 선택 : ");
			menu = d.getIn().nextInt();
			
			if (menu == 1) {
				d.insertStore();
			}else if (menu == 2) {
				d.manageStore();
			}else if (menu == 3) {
				d.checkStore();
			}else if (menu == 4) {
				break;
			}else{
				System.out.println("다시 선택");
			}
			
		
			
		}
		
	}

}
