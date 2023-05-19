package departments;

public class Store {
	private String name;
	private String location;
	private String type;
	
	
	public Store(String name,String location,String type) {
		this.name = name;
		this.location  = location;
		this.type = type;	
	}
	
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public String getType() {
		return type;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public void setType(String type) {
		this.type = type;
	}
	
}
