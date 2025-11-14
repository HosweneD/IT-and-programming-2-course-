import java.util.regex.*;
import java.util.Scanner;

public class WordFinder {

    public static void findWords(String text, char letter) {

        Pattern pattern = Pattern.compile("\\b[" + Character.toLowerCase(letter) + Character.toUpperCase(letter) + "]\\w*\\b");
        Matcher matcher = pattern.matcher(text);

        System.out.print("Слова, начинающиеся с буквы '" + letter + "': ");

        boolean wordFound = false;

        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
            wordFound = true;
        }

        if (!wordFound) {
            System.out.println("слова не найдены.");
        }
    }

    public static void main(String[] args) {

        String text = "Board beard Boring Fight Right Red Black White Quaq write python Python Java go call Of Battlefield dendi cool Cook Lesta tank";

        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Введите букву: ");
            String letter = input.nextLine();

            if (letter.length() != 1) {
                System.out.println("Нужно ввести только одну букву!");
                return;
            }

            findWords(text, letter.charAt(0));
        } catch (PatternSyntaxException ex) {
            System.out.println("Ошибка в регулярном выражении: " + ex.getMessage());
        } finally {
            input.close();
        }
    }
}