import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        int[] digits = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            digits[i] = Character.getNumericValue(input.charAt(i));
        }

        int turns = 0;
        int prevDir = 0;

        for (int i = 0; i < digits.length - 1; i++) {
            int current = digits[i];
            int next = digits[i + 1];

            if (current == next) {
                continue;
            }

            int currDir = (next > current) ? 1 : -1;

            if (prevDir != 0 && currDir != prevDir) {
                turns++;
            }

            prevDir = currDir;
        }

        scanner.close();

        System.out.println(turns);
    }
}