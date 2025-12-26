import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String[] parts = input.split(", ");
        int num1 = Integer.parseInt(parts[0]);
        int num2 = Integer.parseInt(parts[1]);

        String str1 = Integer.toString(num1);
        String str2 = Integer.toString(num2);

        int maxLength = Math.max(str1.length(), str2.length());
        str1 = padLeft(str1, maxLength);
        str2 = padLeft(str2, maxLength);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            int digit1 = Character.getNumericValue(str1.charAt(i));
            int digit2 = Character.getNumericValue(str2.charAt(i));
            int sum = digit1 + digit2;
            result.append(sum);
        }

        scanner.close();

        System.out.println(result.toString());
    }

    private static String padLeft(String s, int length) {
        if (s.length() >= length) {
            return s;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length - s.length(); i++) {
            sb.append('0');
        }
        sb.append(s);
        return sb.toString();
    }
}