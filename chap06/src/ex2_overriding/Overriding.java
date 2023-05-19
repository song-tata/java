package ex2_overriding;

class Speaker	{
	//Protected : (외부 : private / 자식 : public)
	protected int volume;
	
	public void showVolme() {
		System.out.println("볼륨 크기" +this.getVolume());
		}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		if( volume > 0)
			this.volume = volume;
	}
	
}

class BaseSpeaker extends Speaker{
	@Override
	public void setVolume(int volume) {
		if(volume < 20 ) 
			System.out.println("음량을 낮출 수 없습니다.");
		else
			this.volume = volume;
	}
}

public class Overriding {
	
	public static void main(String[] args) {
		Speaker s1 = new Speaker();
		s1.setVolume(15);
		s1.showVolme();
		
		Speaker s2 = new BaseSpeaker();
		s2.setVolume(15);
		s2.showVolme();		
	}
}
