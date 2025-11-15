package Tasks.Tasks3;

import java.util.Scanner;

public class Task1 {

    public static String reverseWords(String input) {

        String[] words = input.split("\\s+");

        StringBuilder reversed = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }

        return reversed.toString();
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        String result = reverseWords(str);

        System.out.println(result);

        input.close();
    }
}