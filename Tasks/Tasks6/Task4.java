import java.util.Scanner;
import java.util.HashMap;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        scanner.close();

        int lastSpace = line.lastIndexOf(' ');
        String arrayStr = line.substring(0, lastSpace).trim();
        int n = Integer.parseInt(line.substring(lastSpace + 1).trim());

        arrayStr = arrayStr.substring(1, arrayStr.length() - 1).replaceAll(" ", "");
        String[] parts = arrayStr.split(",");
        int[] arr = new int[parts.length];
        for (int i = 0; i < parts.length; i++) {
            arr[i] = Integer.parseInt(parts[i]);
        }

        int[] result = twoProduct(arr, n);

        if (result.length == 0) {
            System.out.println("[]");
        } else {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        }
    }

    private static int[] twoProduct(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];

            if (n == 0) {
                if (current == 0) {
                    for (int j = 0; j < i; j++) {
                        return new int[]{arr[j], current};
                    }
                } else {
                    if (map.containsKey(0)) {
                        return new int[]{0, current};
                    }
                }
            } else {
                if (current != 0 && n % current == 0) {
                    int complement = n / current;
                    if (map.containsKey(complement)) {
                        return new int[]{complement, current};
                    }
                }
            }

            map.put(current, i);
        }

        return new int[0];
    }
}