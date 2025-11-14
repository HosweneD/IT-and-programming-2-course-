import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {

    public static double calculate(double a, double b, String operation) throws CustomDivisionException, CustomUnsupportedOperationException { //1, 8
        try {
            switch (operation) {
                case "+": return a + b;
                case "-": return a - b;
                case "*": return a * b;
                case "/":
                    if (b == 0) {
                        throw new CustomDivisionException(a, b);
                    } else {
                        return a / b;
                    }
                default: throw new CustomUnsupportedOperationException();
            }
        } catch (CustomUnsupportedOperationException | CustomDivisionException ex) {
            System.out.println(ex.getMessage());
            ExceptionLogger.logException(ex);
        }
        return 0;
    }

    public static void validateAge(int age) throws CustomAgeException { //2
        try {
            if (age < 0 || age > 120) {
                throw new CustomAgeException(age);
            } else {
                System.out.println("Ваш возраст: " + age);
            }
        } catch (CustomAgeException ex) {
            System.out.println(ex.getMessage());
            ExceptionLogger.logException(ex);
        }
    }

    public static void readFile(String fileName) throws CustomFileNotFoundException { //3
        try {
            File file = new File(fileName);
            if (!file.exists()) {
                throw new CustomFileNotFoundException(fileName);
            }
        } catch (CustomFileNotFoundException ex) {
            System.out.println(ex.getMessage());
            ExceptionLogger.logException(ex);
        }
    }

    public static int forParseNumber(String str) throws CustomNumberFormatException { //4
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            throw new CustomNumberFormatException(str);
        }
    }

    public static int parseNumber(String str) {
        try {
            forParseNumber(str);
        } catch (CustomNumberFormatException ex) {
            System.out.println(ex.getMessage());
            ExceptionLogger.logException(ex);
        }
        return 0;
    }

    public static int getNumberInput(Scanner input) throws CustomInputMismatchException { //6
        try {
            return input.nextInt();
        } catch (InputMismatchException ex) {
            throw new CustomInputMismatchException();
        }
    }

    public static void validateEmail(String email) throws CustomEmailFormatException { //7
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (!Pattern.compile(emailRegex).matcher(email).matches()) {
            throw new CustomEmailFormatException(email);
        }
    }

    public static void main(String[] args) throws CustomDivisionException, CustomUnsupportedOperationException, CustomAgeException, CustomFileNotFoundException, CustomNumberFormatException, CustomInputMismatchException, CustomEmailFormatException {
        System.out.println(calculate(150, 0, "/"));

        // validateAge(32);
        // validateAge(-4);

        // readFile("none");

        // System.out.println(parseNumber("12"));
        // parseNumber("f");

        // Scanner input = new Scanner(System.in);
        // getNumberInput(input);
        // input.close();

        // validateEmail("ddddd@d");
    }
}