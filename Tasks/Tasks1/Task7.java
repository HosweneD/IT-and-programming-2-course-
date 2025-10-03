import java.util.Scanner;

public class Task7 {
    public static int average(int a, int b, int c) {
        return (a + b + c) / 3;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        System.out.println(average(a, b, c));

        scanner.close();
    }
}
