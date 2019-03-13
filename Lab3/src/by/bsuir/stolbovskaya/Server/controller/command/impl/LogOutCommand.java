package by.bsuir.stolbovskaya.Server.controller.command.impl;

import by.bsuir.stolbovskaya.Server.controller.ServerThread;
import by.bsuir.stolbovskaya.Server.controller.command.Command;

public class LogOutCommand implements Command {

    @Override
    public String execute(String request) {

        ServerThread threadInst = (ServerThread)Thread.currentThread();
        threadInst.setCurrentUser(null);

        return "Logout success.";
    }
}
