import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        scanner.close();

        String result = processURL(url);
        System.out.println(result);
    }

    private static String processURL(String url) {

        int questionIndex = url.indexOf('?');

        if (questionIndex == -1) {
            return url;
        }

        String base = url.substring(0, questionIndex);
        String queryString = url.substring(questionIndex + 1);

        String[] params = queryString.split("&");
        ArrayList<Param> paramList = new ArrayList<>();

        for (String param : params) {
            int equalsIndex = param.indexOf('=');
            if (equalsIndex == -1) {
                continue;
            }

            String key = param.substring(0, equalsIndex);
            String value = param.substring(equalsIndex + 1);

            if (value.isEmpty()) {
                continue;
            }
            paramList.add(new Param(key, value));
        }

        if (paramList.isEmpty()) {
            return base;
        }

        Collections.sort(paramList);

        StringBuilder newQuery = new StringBuilder();
        for (int i = 0; i < paramList.size(); i++) {
            Param p = paramList.get(i);
            newQuery.append(p.key).append('=').append(p.value);
            if (i < paramList.size() - 1) {
                newQuery.append('&');
            }
        }

        return base + "?" + newQuery.toString();
    }

    static class Param implements Comparable<Param> {
        String key;
        String value;

        Param(String key, String value) {
            this.key = key;
            this.value = value;
        }

        @Override
        public int compareTo(Param other) {
            int lengthDiff = this.value.length() - other.value.length();
            if (lengthDiff != 0) {
                return lengthDiff;
            }
            return this.key.compareTo(other.key);
        }
    }
}