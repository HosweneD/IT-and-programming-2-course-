import java.util.Scanner;

public class Task1 {
    public static int toFahrenheit(int celsius) {
        return celsius * 9 / 5 + 32;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int celsius = scanner.nextInt();
        System.out.println(toFahrenheit(celsius));

        scanner.close();
    }
}