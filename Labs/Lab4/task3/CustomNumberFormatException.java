public class CustomNumberFormatException extends Exception {
    public CustomNumberFormatException(String input) {
        super("Неверный числовой формат " + "(" + input + ")");
    }
}