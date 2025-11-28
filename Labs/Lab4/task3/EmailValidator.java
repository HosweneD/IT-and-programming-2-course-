import java.util.regex.Pattern;

public class EmailValidator {
    private static final String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
    private static final Pattern pattern = Pattern.compile(emailRegex);

    public static void validateEmail(String email) throws CustomEmailFormatException {
        if (email == null || !pattern.matcher(email).matches()) {
            throw new CustomEmailFormatException("Email-адрес (" + email + ") имеет некорректный формат.");
        } else {
            System.out.println("Email-адрес " + email + " допустим.");
        }
    }
}