package programmingproblum;

public class ex4_Line {
	int len;
	boolean samesame;
	public ex4_Line() {
		
	}
	public ex4_Line(int len) {
		this.len = len;
	}
	public boolean isSameLine(ex4_Line a) {
		if(this.len == a.len) {
			samesame = true;
		}else {
			samesame = false;
		}
		
		return samesame;
		
		
	}
}
