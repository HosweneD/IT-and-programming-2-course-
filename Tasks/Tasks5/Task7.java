import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        int[] arr = parseArray(input);

        int result = maxEvenSubarray(arr);

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

    private static int maxEvenSubarray(int[] arr) {
        int n = arr.length;

        if (n == 0) {
            return 0;
        }

        int maxAll = maxEvenSum(arr, 0, n - 1);

        if (n == 1) {
            return maxAll;
        }

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        if (maxAll != totalSum || totalSum % 2 != 0) {
            return maxAll;
        }

        int maxWithoutFirst = maxEvenSum(arr, 1, n - 1);
        int maxWithoutLast = maxEvenSum(arr, 0, n - 2);

        return Math.max(maxWithoutFirst, maxWithoutLast);
    }

    private static int maxEvenSum(int[] arr, int left, int right) {
        if (left > right) {
            return 0;
        }

        int evenMin = 0;
        int oddMin = Integer.MAX_VALUE;
        int currentSum = 0;
        int maxEven = 0;

        for (int i = left; i <= right; i++) {
            currentSum += arr[i];

            if (currentSum % 2 == 0) {

                maxEven = Math.max(maxEven, currentSum - evenMin);
                evenMin = Math.min(evenMin, currentSum);
            } else {

                if (oddMin != Integer.MAX_VALUE) {
                    maxEven = Math.max(maxEven, currentSum - oddMin);
                }
                oddMin = Math.min(oddMin, currentSum);
            }
        }

        return maxEven;
    }
}