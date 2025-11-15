package Tasks.Tasks3;

import java.util.Scanner;

public class Task9 {

    public static int differenceMaxMin(int[] array) {

        int min = array[0];
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max - min;
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

        System.out.println(differenceMaxMin(numbers));

        input.close();
    }
}