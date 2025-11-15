package Tasks.Tasks3;

import java.util.Arrays;
import java.util.Scanner;

public class Task6 {

    public static int[] filterEven(int[] numbers) {

        int count = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                count++;
            }
        }

        int[] result = new int[count];

        int index = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                result[index] = num;
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();

        String cleanedInput = userInput.replace("[", "").replace("]", "").replace(" ", "");

        String[] stringNumbers = cleanedInput.split(",");
        int[] numbers = new int[stringNumbers.length];

        for (int i = 0; i < stringNumbers.length; i++) {
            numbers[i] = Integer.parseInt(stringNumbers[i]);
        }

        int[] evenNumbers = filterEven(numbers);

        System.out.println(Arrays.toString(evenNumbers));

        input.close();
    }
}