package by.bsuir.stolbovskaya.Server.controller.command.impl;

import by.bsuir.stolbovskaya.Server.controller.ServerThread;
import by.bsuir.stolbovskaya.Server.controller.command.Command;
import by.bsuir.stolbovskaya.Server.controller.command.util.Parser;
import by.bsuir.stolbovskaya.Server.domain.User;
import by.bsuir.stolbovskaya.Server.service.ServiceFactory;
import by.bsuir.stolbovskaya.Server.service.exception.ServiceException;

public class DeleteAffairCommand implements Command {

    @Override
    public String execute(String request) {

        String[] params = Parser.parse(request);

        if (params.length != 1) {
            return "Necessary args count : 1.";
        }

        String response;

        try {

            User user = ((ServerThread)Thread.currentThread()).getCurrentUser();
            if (user == null || user.getRole().equals(User.Role.USER)) {
                throw new ServiceException("Access denied");
            }

            ServiceFactory.getInstance().getAffairService().deleteAffairById(Integer.valueOf(params[0]));
            response = "Delete success.";

        } catch (ServiceException e) {
            response = e.getMessage();
        }

        return response;
    }
}
