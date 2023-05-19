package Department;

import java.util.Scanner;

public class departTest {

	public static void main(String[] args) {
		Scanner choice = new Scanner(System.in);
		boolean run = true;
		System.out.println("1. 매장 입력");
		System.out.println("2. 매장 관리");
		System.out.println("3. 매장 확인");
		System.out.println("4. 종 료");
		department departments = new department();
		while (run) {
			System.out.println("1.매장입력  / 2.매장관리  / 3.매장 확인");
			System.out.print(">>> 번호를 선택하세요 >>");
			int select = choice.nextInt();
		//매장이름 위치 종류 입력하고 배열에 저장
			if (select == 1) {//inputStore
				
				departments.insertStore(null, null, null);
//			System.out.println("생성할 매장이름은? :");
//			String name = choice.next();
//			System.out.println("생성할 매장의 위치는? :");
//			String location = choice.next();
//			System.out.println("생성할 매장의 타입은? :");
//			String type = choice.next();
			
			//*배열에 추가하는 메소드 필요 
			}
			//매장의 배열리스트가 출력 존재하면 출력 else if 다시입력
			// 존재한다면 이름을 바꿀건지 위치를바꿀건지 종류를 바꿀건지 선택
			// 수정사항 입력
			if (select == 2) {
				
			}
			
			//리스트 출력
			//매장정보
			//매장명:나이키 매장위치:A-30 매장종류:잡화
			//
			if (select == 3) {
				
			}
			
			//종료
			if (select == 4) {
				
			}
}
	}

}
