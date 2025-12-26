import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        scanner.close();

        String[] parts = input.split(" ");
        String s = parts[0];
        int k = Integer.parseInt(parts[1]);

        int n = s.length();
        int offset = ((k % n) + n) % n;

        String result = s.substring(offset) + s.substring(0, offset);

        System.out.println(result);
    }
}