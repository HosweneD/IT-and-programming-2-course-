public class CustomDivisionException extends Exception {
    public CustomDivisionException(double a, double b) {
        super("Деление на ноль запрещено (" + a + "/" + b + ")");
    }
}