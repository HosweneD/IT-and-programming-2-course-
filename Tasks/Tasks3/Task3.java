package Tasks.Tasks3;

import java.util.Scanner;

public class Task3 {
    
    public static int secondLargest(int[] array) {

        int largest = 0;
        int secondLargest = 0;

        for (int num : array) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        String cleanedInput = str.replace("[", "").replace("]", "").replace(" ", "");

        String[] stringArray = cleanedInput.split(",");
        int[] array = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }

        System.out.println(secondLargest(array));

        input.close();
    }
}