package course2.homework5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    private static boolean check(String login, String password, String confirmPassword) {
        if (login.length() > 20 || login.length() < 5) {
            throw new WrongLoginException("Login length must be between 5 and 20 characters");
        }
        Pattern pattern = Pattern.compile("\\W");
        Matcher matcherLogin = pattern.matcher(login);
        if (matcherLogin.find()) {
            throw new WrongLoginException("Login has illegal symbol");
        }

        if (password.length() > 20 || password.length() < 5) {
            throw new WrongPasswordException("Password length must be between 5 and 20 characters");
        }
        Matcher matcherPassword = pattern.matcher(password);
        if (matcherPassword.find()) {
            throw new WrongPasswordException("Password has illegal symbol");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Passwords do not match");
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check("java1",
                "K_3rtyu", "K_3rtyu"));
        try {
            System.out.println(check("java2",
                    "K_3rt'yu", "K_3rt'yu"));
        } catch (WrongLoginException | WrongPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}
