package by.htp.library.dao;

import by.htp.library.dao.impl.FileBookDao;
import by.htp.library.dao.impl.FileClientDao;

public class DAOProvider {
	
	private DAOProvider() {}
	
	private static final DAOProvider instance = new DAOProvider();
	
	private ClientDao clientDao = new FileClientDao();
	private BookDao bookDao = new FileBookDao();
	
	public ClientDao getClientDao() {
		return clientDao;
	}
	
	public BookDao getBookDao() {
		return bookDao;
	}

	public static DAOProvider getProvider() {
		return instance;
	}
	
	

}
