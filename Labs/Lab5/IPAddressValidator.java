import java.util.regex.*;
import java.util.Scanner;

public class IPAddressValidator {

    public static boolean validateIPAdress(String ipAdress) {

        Pattern pattern = Pattern.compile("^([01]?[0-9]?[0-9]|2?[0-4]?[0-9]|2?5?[0-5])\\." + "([01]?[0-9]?[0-9]|2?[0-4]?[0-9]|2?5?[0-5])\\." + "([01]?[0-9]?[0-9]|2?[0-4]?[0-9]|2?5?[0-5])\\." + "([01]?[0-9]?[0-9]|2?[0-4]?[0-9]|2?5?[0-5])$");
        Matcher matcher = pattern.matcher(ipAdress);

        return matcher.matches();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите IP-адрес: ");
        String ipAdress = input.nextLine();

        try {
            if (validateIPAdress(ipAdress)) {
                System.out.println("IP-адрес корректен.");
            } else {
                System.out.println("В IP-адресе допущена ошибка!");
            }
        } catch (PatternSyntaxException ex) {
            System.out.println("Ошибка в регулярном выражении.");
        } finally {
            input.close();
        }
    }
}