package practis;

public class Animal {
	boolean live;
	int age;
	String name;
	
	public Animal() {
		this.live = true;
	}
	public Animal(int age,String name) {
		this.age = age;
		this.name = name;
		this.live = true;
	}
	public boolean isLive() {
		return live;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void isNameAndLive() {
		if(live == true) {
			String s = "살아있습니다.";
		System.out.printf("이름은 %s, %s\n",name,s);
		}
	}
}
