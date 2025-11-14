import java.util.regex.*;
import java.util.Scanner;

public class PasswordValidator {

    public static boolean validatePassword(String password) {
        if (password.isEmpty()) {
            System.out.println("Пароль не может быть пустым!");
            return false;
        }

        try {
            if (!password.matches("^(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,16}$")) {
                if (password.length() < 8 || password.length() > 16) {
                    System.out.println("Длина пароля должна быть от 8 до 16 символов!");
                } else if (!password.matches("[a-zA-Z\\d]*")) {
                    System.out.println("Пароль должен содержать только латинские буквы и цифры!");
                } else if (!password.matches(".*[A-Z].*")) {
                    System.out.println("Пароль должен содержать хотя-бы одну заглавную букву!");
                } else if (!password.matches(".*\\d.*")) {
                    System.out.println("Пароль должен содержать хотя-бы одну цифру!");
                } else {
                    System.out.println("Пароль не соответствует требованиям.");
                }
                return false;
            }

            return true;
        } catch (PatternSyntaxException ex) {
            System.out.println("Ошибка в регулярном выражении: " + ex.getMessage());
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Введите пароль: ");
        String password = input.nextLine();

        if (validatePassword(password)) {
            System.out.println("Пароль корректен :)");
        }

        input.close();
    }
}