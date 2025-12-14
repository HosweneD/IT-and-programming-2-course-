import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();

        String arrayStr = input.substring(1, input.length() - 1);

        String[] elements = arrayStr.split(",");
        int[] arr = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            arr[i] = Integer.parseInt(elements[i].trim());
        }

        int result = maxConsecutiveOnes(arr);
        System.out.println(result);

        scanner.close();
    }

    public static int maxConsecutiveOnes(int[] arr) {
        int maxCount = 0;
        int currentCount = 0;

        for (int num : arr) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }

        return maxCount;
    }
}