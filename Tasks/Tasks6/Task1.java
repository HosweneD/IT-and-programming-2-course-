import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String result = findHiddenPalindrome(input);
        System.out.println(result);
    }

    private static String findHiddenPalindrome(String s) {
        String best = "none";
        int bestLen = 0;
        int bestStart = Integer.MAX_VALUE;

        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                String sub = s.substring(i, j + 1);

                StringBuilder lettersOnly = new StringBuilder();
                for (char c : sub.toCharArray()) {
                    if (Character.isLetter(c)) {
                        lettersOnly.append(Character.toLowerCase(c));
                    }
                }

                String filtered = lettersOnly.toString();

                if (filtered.length() >= 2 && canFormPalindrome(filtered)) {
                    if (filtered.length() > bestLen || 
                        (filtered.length() == bestLen && i < bestStart)) {
                        best = filtered;
                        bestLen = filtered.length();
                        bestStart = i;
                    }
                }
            }
        }

        return best;
    }

    private static boolean canFormPalindrome(String s) {

        int[] count = new int[26];
        for (char c : s.toCharArray()) {
            count[c - 'a']++;
        }

        int oddCount = 0;
        for (int freq : count) {
            if (freq % 2 != 0) {
                oddCount++;
            }
        }

        return oddCount <= 1;
    }
}