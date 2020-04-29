package by.htp.library.service;

public interface ClientService {
	
	boolean authorization(String login, String password) throws ClientServiceException; 
	boolean registratiion(String login, String password) throws ClientServiceException;
		
	

}
