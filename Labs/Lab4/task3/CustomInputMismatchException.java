public class CustomInputMismatchException extends Exception {
    CustomInputMismatchException() {
        super("Ошибка: введено не целочисленное значение");
    }
}