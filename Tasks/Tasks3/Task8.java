package Tasks.Tasks3;

import java.util.Scanner;

public class Task8 {

    public static int fibonacci(int n) {

        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int userInput = input.nextInt();

        System.out.println(fibonacci(userInput));

        input.close();
    }
}