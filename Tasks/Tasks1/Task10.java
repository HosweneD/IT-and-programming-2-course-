import java.util.Scanner;

public class Task10 {
    public static String season(int month) {
        if (month == 12 || month == 1 || month == 2) return "зима";
        if (month >= 3 && month <= 5) return "весна";
        if (month >= 6 && month <= 8) return "лето";
        if (month >= 9 && month <= 11) return "осень";
        return "Некорректный ввод";
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();
        System.out.println(season(month));

        scanner.close();
    }
}
