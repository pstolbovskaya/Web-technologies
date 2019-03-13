package by.bsuir.stolbovskaya.Server.controller.command.impl;

import by.bsuir.stolbovskaya.Server.controller.ServerThread;
import by.bsuir.stolbovskaya.Server.controller.command.Command;
import by.bsuir.stolbovskaya.Server.controller.command.util.Parser;
import by.bsuir.stolbovskaya.Server.controller.util.AffairStringBuilder;
import by.bsuir.stolbovskaya.Server.domain.Affair;
import by.bsuir.stolbovskaya.Server.domain.User;
import by.bsuir.stolbovskaya.Server.service.ServiceFactory;
import by.bsuir.stolbovskaya.Server.service.exception.ServiceException;

public class GetAffairByIdCommand implements Command {

    public String execute(String request) {

        String[] params = Parser.parse(request);

        if (params.length != 1) {
            return "Necessary args count : 1.";
        }

        String response;

        try {
            User user = ((ServerThread)Thread.currentThread()).getCurrentUser();
            if (user == null) {
                throw new ServiceException("Access denied");
            }

            Affair affair = ServiceFactory.getInstance().getAffairService().getAffairById(Integer.valueOf(params[0]));
            if (affair != null) {
                AffairStringBuilder sb = new AffairStringBuilder();
                return sb.buildString(affair);
            }
            else {
                response = "No such affair";
            }
        } catch (ServiceException e) {
            response = e.getMessage();
        }

        return response;
    }

}
