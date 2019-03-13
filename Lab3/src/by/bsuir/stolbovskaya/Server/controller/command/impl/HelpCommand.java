package by.bsuir.stolbovskaya.Server.controller.command.impl;

import by.bsuir.stolbovskaya.Server.controller.command.Command;

public class HelpCommand implements Command {
    @Override
    public String execute(String request) {
        return "register\nlogin\nlogout\nadd\ndelete\nget\nupdate\nquit";
    }
}
