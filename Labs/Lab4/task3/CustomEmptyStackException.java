public class CustomEmptyStackException extends Exception {
    public CustomEmptyStackException() {
        super("Невозможно извлечь элемент из пустого стека");
    }
}