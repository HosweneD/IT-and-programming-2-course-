package Tasks.Tasks3;

import java.util.Scanner;

public class Task4 {

    public static int sumOfDigits(int number) {

        int sum = 0;

        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        return sum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        System.out.println(sumOfDigits(number));

        input.close();
    }
}