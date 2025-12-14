import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(nonRepeat(input));

        scanner.close();
    }

    public static String nonRepeat(String s) {

        if (s == null || s.isEmpty()) {
            return "";
        }


        Map<Character, Integer> freq = new HashMap<>();
        String lowerS = s.toLowerCase();
        for (char c : lowerS.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        return processRecursively(s, 0, freq);
    }

    private static String processRecursively(String s, int index, Map<Character, Integer> freq) {

        if (index >= s.length()) {
            return "";
        }

        char currentChar = s.charAt(index);
        char lowerChar = Character.toLowerCase(currentChar);

        if (freq.get(lowerChar) <= 3) {
            return currentChar + processRecursively(s, index + 1, freq);
        } 

        else {
            return processRecursively(s, index + 1, freq);
        }
    }
}