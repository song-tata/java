package staticcheck;

public class Student04 {
	String name;
	private static int stuNum = 1000;
	int cardNum;
	
	public Student04() {
		
		cardNum = stuNum+100;
		stuNum++;
		return;
	}
	
	public Student04(String name) {
		this.name = name;
		this.cardNum += (stuNum + 100);
		stuNum++;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static int getStuNum() {
		return stuNum;
	}

	public static void setStuNum(int stuNum) {
		Student04.stuNum = stuNum;
	}

	public int getCardNum() {
		return cardNum;
	}

	public void setCardNum(int cardNum) {
		this.cardNum = cardNum;
	}
	
}
