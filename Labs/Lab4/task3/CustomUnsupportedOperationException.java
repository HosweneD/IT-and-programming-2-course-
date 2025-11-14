public class CustomUnsupportedOperationException extends Exception {
    public CustomUnsupportedOperationException() {
        super("Операция неподдерживается");
    }
}