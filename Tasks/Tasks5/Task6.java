import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] parts = input.split(", ");
        String s1 = parts[0];
        String s2 = parts[1];

        if (s1.length() != s2.length()) {
            System.out.println(-1);
            return;
        }

        int shift = (s2.charAt(0) - s1.charAt(0) + 26) % 26;

        for (int i = 0; i < s1.length(); i++) {
            char c1 = s1.charAt(i);
            char c2 = s2.charAt(i);
            int currentShift = (c2 - c1 + 26) % 26;
            if (currentShift != shift) {
                System.out.println(-1);
                return;
            }
        }

        scanner.close();

        System.out.println(shift);
    }
}