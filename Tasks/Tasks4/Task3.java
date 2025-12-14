import java.util.Scanner;
import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        String clean = input.replace("\"", "").replace(" ", "");

        String[] parts = clean.split(",");

        if (parts.length < 2) {
            System.out.println("[]");
            return;
        }

        String message = parts[0];
        String key = parts[1];

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < message.length() && i < key.length(); i++) {
            int messageNum = message.charAt(i) - 'A' + 1;
            int keyNum = key.charAt(i) - 'A' + 1;
            result.add(messageNum ^ keyNum);
        }

        System.out.print("[");
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i));
            if (i < result.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}