package sync;

public class StudyMain {

	public static void main(String[] args) {
		Study s = new Study();
		
		//섞이면 안되는 경우 다른 클래스를 통해 구현해야 함.
		//같은 클래스를 통해 실행할 때 우선순위가 동일하기 때문에
		//순서가 정해지지않음
		PersonA pa = new PersonA("최선락", s);
//		PersonB pb = new PersonB("송경근", s);
		PersonA pb = new PersonA("송경근", s);
		pa.start();
		pb.start();
	}

}
