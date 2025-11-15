package Tasks.Tasks3;

import java.util.Scanner;

public class Task10 {

    public static boolean isTriangle(int a, int b, int c) {

        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String userInput = input.nextLine();

        String[] sides = userInput.split(", ");

        int a = Integer.parseInt(sides[0]);
        int b = Integer.parseInt(sides[1]);
        int c = Integer.parseInt(sides[2]);

        System.out.println(isTriangle(a, b, c));

        input.close();
    }
}