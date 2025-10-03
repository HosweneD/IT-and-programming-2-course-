import java.util.InputMismatchException;
import java.util.Scanner;

public class Task2 {
    public static double rectangleArea(double length, double width) {
        return length * width;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            double length;
            double width;

            try {
                length = scanner.nextDouble();
                if (length <= 0) {
                    System.out.println("Ошибка: длина должна быть положительным числом.");
                    return;
                }

                width = scanner.nextDouble();
                if (width <= 0) {
                    System.out.println("Ошибка: должна быть положительным числом.");
                    return;
                }

                double result = rectangleArea(length, width);
                System.out.println(result);

            } catch (InputMismatchException e) {
                System.out.println("Ошибка: необходимо ввести числовые значения.");
            }
        }
    }
}
