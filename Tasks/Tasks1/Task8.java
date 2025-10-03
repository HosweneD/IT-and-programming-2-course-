import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.nextLine();
            System.out.println(isPalindrome(s));

            scanner.close();
    }

    public static String reverseString(String s) {
        String reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed += s.charAt(i);
        }
        return reversed;
    }

    public static boolean isPalindrome(String s) {
        String reversed = reverseString(s);
        return s.equals(reversed);
    }
}