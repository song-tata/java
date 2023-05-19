package ex1_inheritance.crm;

import java.util.Iterator;
import java.util.Scanner;

public class CustometTest {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Customer lee = new Customer(10010,"leesunsin");
		
		lee.setBonusPoint(1000);		
		System.out.println(lee.calcPrice(55000));
		System.out.println(lee.showCustomerInfo());
		
		
		Customer kim = new VIPCustomer(11001, "kimUsin", 1111); 
		kim.setBonusPoint(10000);
		System.out.println(kim.calcPrice(55000));
		System.out.println(kim.showCustomerInfo());
		
		Customer[] customer = new Customer[5];
		
		customer[0] = new VIPCustomer(11231, "김유신", 12345);
		customer[1] = new GoldCustomer(11111, "이순신");
		customer[2] = new GoldCustomer(11112, "신사임당");
		customer[3] = new Customer(11113, "이율곡");
		customer[4] = new Customer(11114, "홍길동");
		
//		for(int i = 0; i < customer.length; i++) {
//		int menu = in.nextInt();
//		String customername = null;
//		int customerID=0;
//		int agentID=0;
//		if (menu==1) {
//		customername = in.next();
//		customerID = in.nextInt();
//		customer[i] = new Customer(customerID,customername);
//		}
//		else if(menu==2) {
//		customername = in.next();
//		customerID = in.nextInt();
//		customer[i] = new GoldCustomer(customerID,customername);
//		}
//		else if(menu==3)
//		customername = in.next();
//		customerID = in.nextInt();
//		agentID = in.nextInt();
//			customer[i] = new VIPCustomer(customerID,customername,agentID);
//		}
		
		
		for(Customer c : customer) {
			System.out.println(c.showCustomerInfo());
		}
	}

}
