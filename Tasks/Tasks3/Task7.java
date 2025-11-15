package Tasks.Tasks3;

import java.util.Scanner;

public class Task7 {

    public static int countWords(String text) {

        String trimmedText = text.trim();
        String[] words = trimmedText.split("\\s+");

        return words.length;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();

        System.out.println(countWords(userInput));

        input.close();
    }
}