package by.htp.library.service;

import by.htp.library.service.impl.BookServiceImpl;
import by.htp.library.service.impl.ClientServiceImpl;

public class ServiceProvider {
	
	private ServiceProvider() {}
	
	private static final ServiceProvider instance = new ServiceProvider();
	
	private BookService bookService = new BookServiceImpl();
	private ClientService clientService = new ClientServiceImpl();
	
	public static ServiceProvider getInstance() {
		return instance;
	}
	
	public BookService getBookService() {
		return bookService;
	}
	
	public ClientService getClientService() {
		return clientService;
	}
	
	

}
