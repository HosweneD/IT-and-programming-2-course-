import java.util.regex.*;

public class NumberFinder {
    public static void main(String[] args) {

        String text = "Население России в 2024 году составляло 146150789 человек. А по данным 2021 года самыми многочисленными национальностями были русские (71.7 %), татары (3.2 %), чеченцы (1.14 %).";

        try {
            Pattern pattern = Pattern.compile("\\d*\\.?\\d+");
            Matcher matcher = pattern.matcher(text);

            System.out.print("Найденные числа: ");
            while (matcher.find()) {
                System.out.print(matcher.group() + " ");
            }
        } catch (PatternSyntaxException ex) {
            System.out.println("Ошибка в регулярном выражении: " + ex.getMessage());
        }
    }
}