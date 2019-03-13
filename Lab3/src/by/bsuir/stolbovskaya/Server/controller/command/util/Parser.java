package by.bsuir.stolbovskaya.Server.controller.command.util;

public class Parser {

    public static String[] parse(String request) {
        return request.split(";");
    }
}
