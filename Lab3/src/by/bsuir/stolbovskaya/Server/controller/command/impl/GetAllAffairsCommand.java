package by.bsuir.stolbovskaya.Server.controller.command.impl;

import by.bsuir.stolbovskaya.Server.controller.ServerThread;
import by.bsuir.stolbovskaya.Server.controller.command.Command;
import by.bsuir.stolbovskaya.Server.controller.util.AffairStringBuilder;
import by.bsuir.stolbovskaya.Server.domain.Affair;
import by.bsuir.stolbovskaya.Server.domain.AffairArchive;
import by.bsuir.stolbovskaya.Server.domain.User;
import by.bsuir.stolbovskaya.Server.service.ServiceFactory;
import by.bsuir.stolbovskaya.Server.service.exception.ServiceException;

import java.util.List;

public class GetAllAffairsCommand implements Command {

    @Override
    public String execute(String request) {
        String response = null;

        try {
            User user = ((ServerThread)Thread.currentThread()).getCurrentUser();
            if (user == null) {
                throw new ServiceException("Access denied");
            }

            AffairArchive archive = ServiceFactory.getInstance().getAffairService().getAll();

            if (archive == null) {
                return "No affairs.";
            }
            List<Affair> affairs = archive.getList();
            if (affairs != null) {
                AffairStringBuilder sb = new AffairStringBuilder();
                return sb.buildString(affairs);
            }
        } catch (ServiceException e) {
            response = e.getMessage();
        }

        return response;
    }

}
