package stream.Ex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerListTest {

	public static void main(String[] args) {
		Customer t1 = new Customer("이순신",50,100);
		Customer t2 = new Customer("김유신",20,100);
		Customer t3 = new Customer("홍길동",13,10);
		
		List<Customer> customerList = new ArrayList<>(Arrays.asList(t1,t2,t3));
		for(Customer i : customerList) {
			System.out.println(i);
		}
		
		System.out.println("고객 명단 출력");
		customerList.stream().map(c -> c.getName()).forEach(System.out::println);
		
		
		int total = customerList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("총 비용: "+total);
		
		System.out.println("20세 이상 고객 정렬하여 출력");
		customerList.stream().filter(c -> c.getAge()>=20)
		.map(c->c.getName()).sorted()
		.forEach(System.out::println);//forEach(s->syso(s);
		
	}

}
