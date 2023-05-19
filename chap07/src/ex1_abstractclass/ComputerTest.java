package ex1_abstractclass;

public class ComputerTest {

	public static void main(String[] args) {
		Computer computer = new DeskTop(); //업캐스팅(묵시적)
//		DeskTop desktop = new DeskTop();
		computer.display();
		computer.turnOn();
		computer.turnOff();
		
		NoteBook myNote1 = new MyNoteBook();
		Computer myNote2 = new MyNoteBook();
		
		myNote1.display();
		myNote2.display();
		
		
		
			
	}

}
