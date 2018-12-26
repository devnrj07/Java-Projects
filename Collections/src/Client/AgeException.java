package Client;

public class AgeException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public AgeException() {
		
	}

public AgeException(String message) {
		System.out.println(" Exception occured for age "+message);
	}
}
