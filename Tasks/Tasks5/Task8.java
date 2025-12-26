import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        double[] arr = parseArray(input);

        double result = spread(arr);

        scanner.close();

        System.out.println(result);
    }

    private static double[] parseArray(String input) {
        String clean = input.substring(1, input.length() - 1).replace(" ", "");

        if (clean.isEmpty()) {
            return new double[0];
        }

        String[] parts = clean.split(",");
        double[] result = new double[parts.length];

        for (int i = 0; i < parts.length; i++) {
            result[i] = Double.parseDouble(parts[i]);
        }

        return result;
    }

    private static double spread(double[] arr) {
        if (arr.length == 0) {
            return 0.0;
        }

        double min = arr[0];
        double max = arr[0];
        double sum = 0;

        for (double num : arr) {
            if (num < min) min = num;
            if (num > max) max = num;
            sum += num;
        }

        double average = sum / arr.length;

        if (average == 0.0) {
            return 0.0;
        }

        return (max - min) / average;
    }
}