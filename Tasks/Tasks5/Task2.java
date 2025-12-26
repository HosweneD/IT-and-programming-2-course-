import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= N; i++) {
            if (!containsDigitSeven(i)) {
                sum += i;
            }
        }

        scanner.close();

        System.out.println(sum);
    }

    private static boolean containsDigitSeven(int n) {

        while (n > 0) {
            if (n % 10 == 7) {
                return true;
            }
            n /= 10;
        }

        return false;
    }
}