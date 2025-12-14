import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] parts = input.split(",");
        int n = Integer.parseInt(parts[0].trim());
        int k = Integer.parseInt(parts[1].trim());

        List<String> result = bruteForce(n, k);
        System.out.println(formatResult(result));

        scanner.close();
    }

    public static List<String> bruteForce(int n, int k) {
        List<String> result = new ArrayList<>();
        if (n > k || n <= 0 || k <= 0) {
            return result;
        }

        boolean[] used = new boolean[k];
        generateCombinations(n, k, used, new StringBuilder(), result);
        return result;
    }

    private static void generateCombinations(int n, int k, boolean[] used, StringBuilder current, List<String> result) {
        if (current.length() == n) {
            result.add(current.toString());
            return;
        }

        for (int i = 0; i < k; i++) {
            if (!used[i]) {
                used[i] = true;
                current.append(i);
                generateCombinations(n, k, used, current, result);
                current.deleteCharAt(current.length() - 1);
                used[i] = false;
            }
        }
    }

    private static String formatResult(List<String> result) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < result.size(); i++) {
            sb.append("\"").append(result.get(i)).append("\"");
            if (i < result.size() - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}