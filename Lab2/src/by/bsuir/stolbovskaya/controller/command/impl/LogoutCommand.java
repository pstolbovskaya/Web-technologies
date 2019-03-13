package by.bsuir.stolbovskaya.controller.command.impl;

import by.bsuir.stolbovskaya.controller.command.Command;
import by.bsuir.stolbovskaya.service.ServiceFactory;

public class LogoutCommand implements Command {
    @Override
    public String execute(String request) {
        if (ServiceFactory.getInstance().getCurrentUser() != null)
        {
            ServiceFactory.getInstance().setCurrentUser(null);
            return "Logout successfully";
        } else {
            return "Already logouted";
        }
    }
}
