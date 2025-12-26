import java.util.Scanner;
import java.util.HashMap;
import java.util.HashSet;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] parts = input.split(", ");
        String s1 = parts[0];
        String s2 = parts[1];

        if (s1.length() != s2.length()) {
            System.out.println(false);
            return;
        }

        HashMap<Character, Character> mapping = new HashMap<>();

        HashSet<Character> used = new HashSet<>();

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);

            if (mapping.containsKey(c1)) {

                if (mapping.get(c1) != c2) {
                    System.out.println(false);
                    return;
                }
            } else {

                if (used.contains(c2)) {
                    System.out.println(false);
                    return;
                }

                mapping.put(c1, c2);
                used.add(c2);
            }
        }

        scanner.close();

        System.out.println(true);
    }
}