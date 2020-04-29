package by.htp.library.controller;

import by.htp.library.command.Command;
import by.htp.library.command.CommandProvider;
import by.htp.library.service.ClientService;
import by.htp.library.service.ClientServiceException;
import by.htp.library.service.ServiceProvider;

public class Controller {
	
	private final CommandProvider commandProvider = new CommandProvider();

	public String doAction(String request) {
		// команды, которые мы получаем в качестве request
		// "authorization login=pupkin password=123"
		// "registration name= ilia email=dom1nik@mail.ru login=pupkin password=123"

		String commandName;
		Command command;
		String response;
		
		commandName = request.split(" ")[0];
		
		command = commandProvider.getCommand(commandName);
		response = command.execute(request);		

		return response;
	}

}
