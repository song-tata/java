package sync;

public class PersonB extends Thread{
	Study s;
	String name;
	
	public PersonB(String name, Study s) {
		this.name = name;
		this.s = s;
	}
	@Override
	public void run() {
		s.mat(name);
	}
}
