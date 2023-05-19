package sync;

public class PersonA extends Thread{
	Study s;
	String name;
	
	public PersonA(String name, Study s) {
		this.name = name;
		this.s = s;
	}
	@Override
	public void run() {
		s.mat(name);
	}
}
