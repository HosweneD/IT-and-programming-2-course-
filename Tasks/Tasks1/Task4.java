import java.util.Scanner;


public class Task4 {
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
            int num = scanner.nextInt();
            System.out.println(isEven(num));

            scanner.close();
    }
}
