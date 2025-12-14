import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numberStr = scanner.nextLine().trim();

        int[] result = digitHistogram(numberStr);
        System.out.println(formatResult(result));

        scanner.close();
    }

    public static int[] digitHistogram(String numberStr) {
        int[] counts = new int[10];

        for (int i = 0; i < numberStr.length(); i++) {
            char c = numberStr.charAt(i);
            if (c >= '0' && c <= '9') {
                int digit = c - '0';
                counts[digit]++;
            }
        }

        return counts;
    }

    private static String formatResult(int[] arr) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i < arr.length - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}