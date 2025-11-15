package Tasks.Tasks3;

import java.util.Arrays;
import java.util.Scanner;

public class Task5 {

    public static boolean isAnagram(String str1, String str2) {

        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String str = input.nextLine();

        String[] strings = str.split(",");

        String str1 = strings[0].trim();
        String str2 = strings[1].trim();

        System.out.println(isAnagram(str1, str2));

        input.close();
    }
}