package by.htp.library.command.impl;

import by.htp.library.command.Command;
import by.htp.library.service.ClientService;
import by.htp.library.service.ClientServiceException;
import by.htp.library.service.ServiceProvider;

public class AuthorizationCommand implements Command{

	@Override
	public String execute(String request) {
		
		String[] param;
		param = request.split(" ");
		
		String login;
		String password;
		
		login = param[1].split("=")[1];
		password = param[2].split("=")[1];
		
		ServiceProvider provider = ServiceProvider.getInstance();
		
		ClientService clientService = provider.getClientService();
		
		String response;
		
		try {
			boolean result;
			result = clientService.authorization(login, password);
			
			if (result) {
				response = "ok";
			} else {
				response = "not ok";
			}
		} catch (ClientServiceException e) {
			// Здесь надо будет залогировать, но это узнаем позже
			System.err.println(e);
			response = "error";
		}
		
		return response;
	}

}
