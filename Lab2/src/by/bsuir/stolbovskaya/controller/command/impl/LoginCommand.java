package by.bsuir.stolbovskaya.controller.command.impl;

import by.bsuir.stolbovskaya.controller.command.Command;
import by.bsuir.stolbovskaya.service.ServiceFactory;
import by.bsuir.stolbovskaya.service.exception.ServiceException;

public class LoginCommand implements Command {

    @Override
    public String execute(String request) {
        String[] params = request.split(";");

        if (params.length < 2) {
            return "Arguments required: 2";
        }

        try {
            boolean logInSuccessful = ServiceFactory.getInstance().getUserService().login(params[0], params[1]);
            if (logInSuccessful) {
                return "Login successful.\n";
            }
            else {
                return "Login failed.\n";
            }
        } catch (ServiceException e) {
            return e.getMessage();
        }
    }
}
