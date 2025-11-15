package Tasks.Tasks3;

import java.util.Scanner;

public class Task2 {

    public static int countVowels(String input) {

        int count = 0;
        String lowerCaseInput = input.toLowerCase();

        for (int i = 0; i < lowerCaseInput.length(); i++) {
            char c = lowerCaseInput.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        System.out.println(countVowels(str));

        input.close();
    }
}