import java.util.regex.*;

public class UppercaseFinder {

    public static String findAndMarkUppercase(String text) {
        Pattern pattern = Pattern.compile("([a-z])([A-Z])");
        Matcher matcher = pattern.matcher(text);

        StringBuffer result = new StringBuffer();

        while (matcher.find()) {
            String replacement = "!" + matcher.group() + "!";
            matcher.appendReplacement(result, replacement);
        }
        matcher.appendTail(result);

        return result.toString();
    }

    public static void main(String[] args) {

        String text = "London iS A CapItAl of GreaT BriTAIN";

        try {
            System.out.println(findAndMarkUppercase(text));
        } catch (PatternSyntaxException ex) {
            System.out.println("Ошибка в синтаксисе регулярного выражения: " + ex.getMessage());
        }
    }
}