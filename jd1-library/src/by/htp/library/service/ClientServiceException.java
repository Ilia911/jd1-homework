package by.htp.library.service;

public class ClientServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public ClientServiceException() {
		super();
	}
	public ClientServiceException(String message) {
		super(message);
	}

	public ClientServiceException(Exception e) {
		super(e);
	}

	public ClientServiceException(String message, Exception e) {
		super(message, e);
	}


}
