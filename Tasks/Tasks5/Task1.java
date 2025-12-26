import java.util.Scanner;
import java.util.LinkedHashSet;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        LinkedHashSet<Character> uniqueChars = new LinkedHashSet<>();

        for (char c : input.toCharArray()) {
            uniqueChars.add(c);
        }

        StringBuilder result = new StringBuilder();
        for (char c : uniqueChars) {
            result.append(c);
        }

        scanner.close();

        System.out.println(result.toString());
    }
}