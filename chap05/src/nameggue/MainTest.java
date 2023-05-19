package nameggue;

public class MainTest {
    
    public static void main(String[] args) {
    	
    	Department2 department = new Department2();
    	
    	int menu = 0;
    	
    	while(true) {
    		System.out.println("메뉴");
    		System.out.println("1.매장 입력 2. 매장 확인 3. 매장관리 4. 종료");
    		System.out.print("메뉴 선택 : ");
    		menu = department.getInput().nextInt();
    		
    		if(menu == 1) {
    			department.inputStore();
    		}else if(menu == 2){
    			department.checkStore();
    		}else if(menu == 3) {
    			continue;
    		}else if(menu == 4) {
    			break;
    		}else {
    			System.out.println("잘못 입력 하셨습니다.");
    		}
    	}
    	department.getInput().close(); // Scanner 닫기.
    }
}
