import java.util.*;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().trim();

        Object[] array = parseArray(input);

        List<Integer> result = deepFlatten(array);

        scanner.close();

        System.out.println(formatResult(result));
    }

    private static List<Integer> deepFlatten(Object[] array) {
        List<Integer> result = new ArrayList<>();
        flattenHelper(array, result);
        return result;
    }

    private static void flattenHelper(Object obj, List<Integer> result) {
        if (obj instanceof Integer) {
            result.add((Integer) obj);
        } else if (obj instanceof Object[]) {
            for (Object item : (Object[]) obj) {
                flattenHelper(item, result);
            }
        }
    }

    private static Object[] parseArray(String input) {
        input = input.substring(1, input.length() - 1);

        List<Object> result = new ArrayList<>();
        int i = 0;
        while (i < input.length()) {
            char c = input.charAt(i);

            if (c == '[') {
                int bracketCount = 1;
                int j = i + 1;
                while (bracketCount > 0) {
                    if (input.charAt(j) == '[') bracketCount++;
                    else if (input.charAt(j) == ']') bracketCount--;
                    j++;
                }
                String subArray = input.substring(i, j);
                result.add(parseArray(subArray));
                i = j;
            } else if (Character.isDigit(c)) {
                int j = i;
                while (j < input.length() && Character.isDigit(input.charAt(j))) {
                    j++;
                }
                int num = Integer.parseInt(input.substring(i, j));
                result.add(num);
                i = j;
            } else {
                i++;
            }

            while (i < input.length() && (input.charAt(i) == ',' || input.charAt(i) == ' ')) {
                i++;
            }
        }

        return result.toArray();
    }

    private static String formatResult(List<Integer> list) {
        if (list.isEmpty()) return "[]";

        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i < list.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}