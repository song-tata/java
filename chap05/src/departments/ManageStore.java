package departments;

import java.util.Scanner;

public class ManageStore {
	
	Department d = new Department();
	static String name = null;
	
	 public void manageStore(Scanner sc) {
		 	System.out.println("매장이름 입력");
	    	name = sc.next();
	    	if(d.isSame(name)) {
	    		System.out.println("수정할 메뉴 선택");
	    		System.out.println("1.매장 이름 / 2.매장 위치 / 3. 매장 종류 4. 각 스토어 매출 확인 / 5. 총 매출 확인 ");
	    		int a = d.in.nextInt();
	    		
	    		switch (a) {
				case 1:
					System.out.println("매장 이름 입력: ");
					String changeName = d.in.next();
					for(Store s : d.stores) {
						if(d.isSame(name)){
			                	s.setName(changeName);
			                	break;
			                	}
					  System.out.println("수정완료");
					}
					break;
					
				case 2:
					System.out.print("매장 위치 입력: ");
					String location = d.in.next();
					for(Store s : d.stores) {
		                if(s.getName().equals(name))
		                	s.setLocation(location);
		                	break;
		                	}
					System.out.println("수정완료");
					break;
					
				case 3:
					System.out.print("매장 종류 입력: ");
					String type = d.in.next();
					for(Store s : d.stores) {
		                if(s.getName().equals(name))
		                	s.setType(type);
		                	break;
		                	}
					System.out.println("수정완료");
					break;
//				case 4:
//					for(Store s : d.stores) {
//						System.out.printf("%s 매장 수입 %d 원\n",s.getName(),s.getMoney());
//					}
//				case 5:
//					int sum = 0;
//					for(Store s : d.stores) {
//						sum += s.getMoney();					
//					}
//					System.out.printf("총 매출 확인 %d",sum);
//					
				default:
					System.out.println("1,2,3,4중에 골라주세요");
					break;
				}
	    	}else
	    		System.out.println("없는 매장입니다.");    	   	
	    }   	
}
