package by.htp.library.main;

import by.htp.library.controller.Controller;

public class Main {

	public static void main(String[] args) {
		
		Controller controller = new Controller();
		
		String request = "authorization login=pupkin password=123";
		String response;
		
		response = controller.doAction(request);
		
		System.out.println(response);
		

	}

}
