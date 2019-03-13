package by.bsuir.stolbovskaya.Server.controller.command.impl;


import by.bsuir.stolbovskaya.Server.domain.User;
import by.bsuir.stolbovskaya.Server.controller.ServerThread;
import by.bsuir.stolbovskaya.Server.controller.command.Command;
import by.bsuir.stolbovskaya.Server.controller.command.util.Parser;
import by.bsuir.stolbovskaya.Server.service.ServiceFactory;
import by.bsuir.stolbovskaya.Server.service.exception.ServiceException;


public class LogInCommand implements Command {

	public String execute(String request) {

		String[] params = Parser.parse(request);

		if (params.length != 2) {
			return "Necessary args count : 2.";
		}

		String response;

		try {
			User user = ServiceFactory.getInstance().getUserService().login(params[0], params[1]);
			if (user != null) {
				ServerThread threadInstance = (ServerThread)Thread.currentThread();
				threadInstance.setCurrentUser(user);

				response = "Successful login.\n";
			}
			else {
				response = "LogIn failed.\n";
			}
		} catch (ServiceException e) {
			response = e.getMessage();
		}

		return response;
	}

}
