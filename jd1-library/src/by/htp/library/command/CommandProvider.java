package by.htp.library.command;

import java.util.HashMap;
import java.util.Map;

import by.htp.library.command.impl.AuthorizationCommand;
import by.htp.library.command.impl.RegistrationCommand;

public class CommandProvider {
	
	private Map<String, Command> commands;
	
	public CommandProvider() {
						
		commands = new HashMap<String, Command>();
		
		commands.put("authorization", new AuthorizationCommand());
		commands.put("registration", new RegistrationCommand());
	}
	
	public Command getCommand(String key) {
		Command command;
		command = commands.get(key);
		
		return command;
		
	}

}
