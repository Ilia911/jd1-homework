package by.htp.library.service;

public class BookServiceException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BookServiceException() {
		super();
	}
	
	public BookServiceException(String message) {
		super(message);
	}
	
	public BookServiceException(Exception e) {
		super(e);
	}
	
	public BookServiceException(String message, Exception e) {
		super(message, e);
	}

}
