package oop3;

public class PublicTransportTest {

	public static void main(String[] args) {
		Subway s2 = new Subway("2");
		Bus bus100 = new Bus(100);
		Student3 a = new Student3("a", 1500);
		Student3 b = new Student3("b", 150000);
		Student3 c = new Student3("c", 7600);
		s2.showInfo();
		//두명의 학생 생성
		//a는 버스 > a정보 출력
		//b는 지하철 > b 정보 출력
		// 지하철의 정보 출력
		// alt + shift + r : 문자 일괄 변경
		a.takeBus(bus100);
		b.takeSubway(s2);
		c.takeBus(bus100);
		s2.showInfo();
		bus100.showInfo();
		a.showInfo();
		b.showInfo();
		c.showInfo();
	
	}

}
