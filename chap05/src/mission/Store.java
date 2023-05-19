package mission;



public class Store {
	String storeName;
	String storeCase;
	String rocation;
	
	public Store(){
		
	}
	//매개 변수 3개를 받는 생성자 작성.
	public Store(String storeName,String storeCase,String rocation) {
		this.storeName = storeName;
		this.storeCase = storeCase;
		this.rocation = rocation;
	}
	
	
	
	public String getStoreName() {
		return storeName;
	}
	public String getStoreCase() {
		return storeCase;
	}
	public String getRocation() {
		return rocation;
	}
	
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public void setStoreCase(String storeCase) {
		this.storeCase = storeCase;
	}
	public void setRocation(String rocation) {
		this.rocation = rocation;
	}
	//매장 정보 반환 메소드
	public String showInpo() {
		return "Store [ name"+storeName+", type="+storeCase+", pos"+rocation;
	}
}
