import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();

        boolean result = palindromeDescendant(num);
        System.out.println(result);
    }

    public static boolean palindromeDescendant(int num) {
        String s = Integer.toString(num);

        while (true) {

            if (isPalindrome(s)) {
                return true;
            }

            if (s.length() % 2 != 0) {
                return false;
            }

            StringBuilder next = new StringBuilder();
            for (int i = 0; i < s.length(); i += 2) {
                int digit1 = s.charAt(i) - '0';
                int digit2 = s.charAt(i + 1) - '0';
                int sum = digit1 + digit2;
                next.append(sum);
            }

            s = next.toString();

            if (s.length() < 2) {
                break;
            }
        }

        return false;
    }

    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}