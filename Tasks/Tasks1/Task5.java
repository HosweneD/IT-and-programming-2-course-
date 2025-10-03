import java.util.Scanner;

public class Task5 {
    private static String getWeekWord(int weeks) {
        if (weeks % 10 == 1 && weeks % 100 != 11) {
            return "неделя";
        } else if (weeks % 10 >= 2 && weeks % 10 <= 4 && (weeks % 100 < 10 || weeks % 100 >= 20)) {
            return "недели";
        } else {
            return "недель";
        }
    }

    private static String getDayWord(int days) {
        if (days % 10 == 1 && days % 100 != 11) {
            return "день";
        } else if (days % 10 >= 2 && days % 10 <= 4 && (days % 100 < 10 || days % 100 >= 20)) {
            return "дня";
        } else {
            return "дней";
        }
    }

    public static String daysToWeeks(int days) {
        if (days < 0) {
            return "0 недель и 0 дней";
        }
        int weeks = days / 7;
        int remainingDays = days % 7;
        return weeks + " " + getWeekWord(weeks) + " и " + remainingDays + " " + getDayWord(remainingDays);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = scanner.nextInt();
        System.out.println(daysToWeeks(days));

        scanner.close();
    }
}
