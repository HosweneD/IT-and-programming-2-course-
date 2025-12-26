import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String result = pilishString(input);
        System.out.println(result);
    }

    private static String pilishString(String s) {
        if (s.isEmpty()) {
            return "";
        }

        int[] piDigits = {3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5, 8, 9, 7, 9};
        StringBuilder result = new StringBuilder();
        int start = 0;
        
        for (int i = 0; i < piDigits.length && start < s.length(); i++) {
            int currentLength = piDigits[i];
            
            if (start + currentLength <= s.length()) {
                result.append(s, start, start + currentLength);
                start += currentLength;
            } else {
                String remaining = s.substring(start);
                result.append(remaining);
                if (remaining.length() > 0) {
                    char lastChar = remaining.charAt(remaining.length() - 1);
                    for (int j = 0; j < currentLength - remaining.length(); j++) {
                        result.append(lastChar);
                    }
                }
                start = s.length();
            }

            if (i < piDigits.length - 1 && start < s.length()) {
                result.append(" ");
            }
        }

        return result.toString();
    }
}