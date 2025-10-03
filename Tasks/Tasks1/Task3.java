import java.util.Scanner;

public class Task3 {
    public static int digitSum(int number) {
        number = Math.abs(number); 
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int input = scanner.nextInt();
            int result = digitSum(input);
            System.out.println(result);

            scanner.close();
        }
    }
}
