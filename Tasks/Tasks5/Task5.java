import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        int[] arr = parseArray(input);

        boolean result = isLandscape(arr);

        scanner.close();

        System.out.println(result);
    }

    private static int[] parseArray(String input) {
        String clean = input.substring(1, input.length() - 1).replace(" ", "");

        if (clean.isEmpty()) {
            return new int[0];
        }

        String[] parts = clean.split(",");
        int[] result = new int[parts.length];

        for (int i = 0; i < parts.length; i++) {
            result[i] = Integer.parseInt(parts[i]);
        }

        return result;
    }

    private static boolean isLandscape(int[] arr) {
        int n = arr.length;

        if (n < 3) {
            return false;
        }

        int i = 0;

        while (i < n - 1 && arr[i] < arr[i + 1]) {
            i++;
        }

        if (i == 0 || i == n - 1) {
            return false;
        }

        for (int j = i; j < n - 1; j++) {
            if (arr[j] <= arr[j + 1]) {
                return false;
            }
        }

        for (int j = 0; j < i; j++) {
            if (arr[j] == arr[j + 1]) {
                return false;
            }
        }

        return true;
    }
}