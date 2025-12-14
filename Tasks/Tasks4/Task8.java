import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Map<String, Integer> result = wordHistogram(input);
        System.out.println(formatResult(result));

        scanner.close();
    }

    public static Map<String, Integer> wordHistogram(String text) {
        Map<String, Integer> wordCount = new LinkedHashMap<>();

        String cleanText = text.toLowerCase().replaceAll("[^a-z\\s]", "");

        String[] words = cleanText.trim().split("\\s+");

        for (String word : words) {
            if (!word.isEmpty()) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        return wordCount;
    }

    private static String formatResult(Map<String, Integer> map) {
        StringBuilder sb = new StringBuilder("{");
        int i = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(entry.getKey()).append(": ").append(entry.getValue());
            i++;
        }
        sb.append("}");
        return sb.toString();
    }
}