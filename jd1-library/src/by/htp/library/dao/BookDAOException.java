package by.htp.library.dao;

public class BookDAOException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// Создаем собственное исключение (ну просто первый раз создаю)
	
	public BookDAOException() {
		super();
		
	}
	
	public BookDAOException(Exception e) {
		super(e);
	}
	
	public BookDAOException(String message) {
		super(message);
	}
	
	public BookDAOException (String message, Exception e) {
		super(message, e);
	}
	

}
