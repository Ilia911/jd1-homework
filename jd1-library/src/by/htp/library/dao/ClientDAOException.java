package by.htp.library.dao;

public class ClientDAOException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public ClientDAOException() {
		super();
	}
	public ClientDAOException(String message) {
		super(message);
	}
	public ClientDAOException(Exception e) {
		super(e);
	}
	public ClientDAOException(String message, Exception e) {
		super(message, e);
	}

}
