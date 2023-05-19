package exam2;

public class DefStoreTest {

	public static void main(String[] args) {
		
		DefStore D = new DefStore();
		int a = 0;
		
		
		while(true) {
			System.out.println("-메뉴 선택-");
			System.out.println("1. 매장 추가 2. 매장 확인 3. 매장관리 4.종료");
			a = D.getI().nextInt();
			
			if(a == 1) {
				D.inputStore();
			}else if (a==2) {
				D.checkStore();
			}else if(a==3) {
				continue;
			}else if(a==4){
				break;
			}else {
				System.out.println("잘못입력하셨습니다");
			}
			
		}
		D.getI().close();//scanner 닫기
	
	}

}
