package nameggue;

public class Store {
    String name; // 매장명
    String type; // 종류
    String pos; // 위치
    
    // 매개변수 3개를 받는 생성자 작성.
    public Store(String name, String type, String pos) {
        this.name = name;
        this.type = type;
        this.pos = pos;
    }

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getPos() {
		return pos;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}
	
	// 매장 정보 반환 메소드
    public String showInfo() {
    	// name = 나이키, type = 잡화, pos = A-30
    	return "Store [ name="+name+", type="+type+", pos="+pos+"]";
    }

}
