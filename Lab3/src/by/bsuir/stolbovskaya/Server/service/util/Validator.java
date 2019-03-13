package by.bsuir.stolbovskaya.Server.service.util;

public class Validator {

    public static boolean isLoginValid(String login) {
        return login.matches("[a-zA-Z_0-9]+");
    }

    public static boolean isPasswordValid(String password) {
        return password.matches("[a-zA-Z_0-9]+");
    }

}
