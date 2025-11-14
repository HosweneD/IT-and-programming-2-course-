public class CustomEmailFormatException extends Exception {
    public CustomEmailFormatException(String email) {
        super("Неверный формат email " + "(" + email + ")");
    }
}