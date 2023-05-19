package exceptions.bank;

public class InsufficientResourcesException extends Exception {
	
	public InsufficientResourcesException(){
		
	}
	
	public InsufficientResourcesException(String message) {
		super(message);
	}
}
