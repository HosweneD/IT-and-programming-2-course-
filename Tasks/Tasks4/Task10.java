import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();

        String arrayStr = input.substring(1, input.length() - 1);

        String[] elements = arrayStr.split(",");
        int[] grades = new int[elements.length];

        for (int i = 0; i < elements.length; i++) {
            grades[i] = Integer.parseInt(elements[i].trim());
        }

        Map<String, Integer> result = evaluateGrades(grades);
        System.out.println(formatResult(result));

        scanner.close();
    }

    public static Map<String, Integer> evaluateGrades(int[] grades) {
        Map<String, Integer> gradeCount = new LinkedHashMap<>();

        gradeCount.put("A", 0);
        gradeCount.put("B", 0);
        gradeCount.put("C", 0);
        gradeCount.put("D", 0);
        gradeCount.put("F", 0);

        for (int grade : grades) {
            if (grade >= 90 && grade <= 100) {
                gradeCount.put("A", gradeCount.get("A") + 1);
            } else if (grade >= 80 && grade <= 89) {
                gradeCount.put("B", gradeCount.get("B") + 1);
            } else if (grade >= 70 && grade <= 79) {
                gradeCount.put("C", gradeCount.get("C") + 1);
            } else if (grade >= 60 && grade <= 69) {
                gradeCount.put("D", gradeCount.get("D") + 1);
            } else if (grade >= 0 && grade <= 59) {
                gradeCount.put("F", gradeCount.get("F") + 1);
            }
        }

        return gradeCount;
    }

    private static String formatResult(Map<String, Integer> map) {
        StringBuilder sb = new StringBuilder("{");
        boolean first = true;

        for (Map.Entry<String, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 0) {
                if (!first) {
                    sb.append(", ");
                }
                sb.append(entry.getKey()).append(": ").append(entry.getValue());
                first = false;
            }
        }

        sb.append("}");
        return sb.toString();
    }
}