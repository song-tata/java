package departments;

import java.util.ArrayList;
import java.util.Scanner;

public class Department {

    ArrayList<Store> stores = new ArrayList<>();
    Scanner in = new Scanner(System.in);
    ManageStore manageStore = new ManageStore();
    
    public Scanner getIn() {
		return in;
	}

	public void setIn(Scanner in) {
		this.in = in;
	}

	public void insertStore() {
        System.out.println("매장 이름 입력: ");
        String name = in.next();
        System.out.println("매장 위치 입력: ");
        String location = in.next();
        System.out.println("매장 종류 입력: ");
        String type = in.next();

        if(isSame(name)){
            System.out.println("같은 이름이 있습니다.");
        } else {
            stores.add(new Store(name, location, type));
        }
    }

    public boolean isSame(String name) {
        boolean isSame = false;
        if(stores != null) {
            for(Store s : stores) {
                if(s.getName().equals(name)) {
                    isSame = true;
                    break;
                }
            }
        }
        return isSame;
    }
    

    public void checkStore() {
        for(Store s : stores) {
//            System.out.println(s.getName());
//            System.out.println(s.getLocation());
//            System.out.println(s.getType());
            System.out.printf("2%s %5s %10s\n",s.getName(),s.getLocation(),s.getType());
        }
    }
    
    public void manageStore() {
    	manageStore.manageStore(in);
//    	System.out.println("매장이름 입력");
//    	String name = in.next();
//    	if(isSame(name)) {
//    		System.out.println("수정할 메뉴 선택");
//    		System.out.println("1.매장 이름 / 2.매장 위치 / 3. 매장 종류 4. 각 스토어 매출 확인 / 5. 총 매출 확인 ");
//    		int a = in.nextInt();
//    		switch (a) {
//			case 1:
//				System.out.println("매장 이름 입력:");
//				String changeName = in.next();
//				  for(Store s : stores) {
//		                if(s.getName().equals(name))
//		                	s.setName(changeName);
//		                	break;
//		                	}
//				  System.out.println("수정완료");
//				break;
//				
//			case 2:
//				System.out.print("매장 위치 입력: ");
//				String location = in.next();
//				for(Store s : stores) {
//	                if(s.getName().equals(name))
//	                	s.setLocation(location);
//	                	break;
//	                	}
//				System.out.println("수정완료");
//				break;
//				
//			case 3:
//				System.out.print("매장 종류 입력: ");
//				String type = in.next();
//				for(Store s : stores) {
//	                if(s.getName().equals(name))
//	                	s.setType(type);
//	                	break;
//	                	}
//				System.out.println("수정완료");
//				break;
////			case 4:
////				for(Store s : stores) {
////					System.out.printf("%s 매장 수입 %d 원\n",s.getName(),s.getMoney());
////				}
////			case 5:
////				int sum = 0;
////				for(Store s : stores) {
////					sum += s.getMoney();					
////				}
////				System.out.printf("총 매출 확인 %d",sum);
////				
//			default:
//				System.out.println("1,2,3,4중에 골라주세요");
//				break;
//			}
//    	}else
//    		System.out.println("없는 매장입니다.");    	   	
    }   	

}