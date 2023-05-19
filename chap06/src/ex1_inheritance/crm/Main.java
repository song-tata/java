package ex1_inheritance.crm;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		ArrayList<Customer> customerlist = new ArrayList<>();
		Scanner in = new Scanner(System.in);
		int menu;
		boolean run = true;
		while(run) {
			int customerID;
			String customerName;
			
			System.out.println("매뉴");
			System.out.println("1. 회원가입 2.회원관리 3.종료");
			System.out.println("매뉴선택> ");
			menu = in.nextInt();
			
			if(menu == 1) {
				System.out.println("회원 ID>");
				customerID = in.nextInt();
				System.out.println("회원 이름> ");
				customerName = in.next();
				customerlist.add(new Customer(customerID, customerName));
				System.out.println("회원 가입 완료.");
			}else if(menu == 2) {
				int subMenu;
				//회원관리(보너스 추가, 회원삭제)
				System.out.println("1. 보너스 포인트 추가 2. 회원 삭제");
				subMenu = in.nextInt();
				if(subMenu == 1) {
					//보너스 포인트
					int bonusPoint;
					System.out.println("회원 ID>");
					customerID = in.nextInt();
					System.out.println("회원 이름> ");
					customerName = in.next();
					System.out.println("추가포인트>");
					bonusPoint = in.nextInt();
					
					boolean userCheck = false;
					
					for(Customer c : customerlist) {
						if(c.getCustomerID() == customerID && c.getCustomerName().equals(customerName)){
							c.setBonusPoint(bonusPoint);
							System.out.println("포인트 추가 완료");
							userCheck = true;
							break;
						}
					}
					if(!userCheck) {
						System.out.println("존재하지않는 회원입니다.");
					}
					
				}else if(subMenu == 2) {
					//회원 삭제
					System.out.println("회원 ID>");
					customerID = in.nextInt();
					System.out.println("회원 이름> ");
					customerName = in.next();
					System.out.println("추가포인트>");
					
					
					boolean userCheck = false;
					
					for(Customer c : customerlist) {
						if(c.getCustomerID() == customerID && c.getCustomerName().equals(customerName)){
							customerlist.remove(c);
							System.out.println("삭제완료");
							userCheck = true;
							break;
						}
					}
					if(!userCheck) {
						System.out.println("존재하지않는 회원입니다.");
					}
				}
			}else if(menu == 3) {
				run = false;
			}else{
				System.out.println("잘못입력하셨습니다.");
			}
			
			
		}
		for(Customer c : customerlist) {
			System.out.println(c.showCustomerInfo());
		}
		
		
		
	}

}
