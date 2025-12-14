import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();

        int splitIndex = input.indexOf("],");

        String arrayStr = input.substring(1, splitIndex);
        int k = Integer.parseInt(input.substring(splitIndex + 2).trim());

        String[] numStrings = arrayStr.split(",");
        int[] arr = new int[numStrings.length];
        for (int i = 0; i < numStrings.length; i++) {
            arr[i] = Integer.parseInt(numStrings[i].trim());
        }

        int result = pairDifference(arr, k);
        System.out.println(result);

        scanner.close();
    }

    public static int pairDifference(int[] arr, int k) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (Math.abs(arr[i] - arr[j]) == k) {
                    count++;
                }
            }
        }

        return count;
    }
}