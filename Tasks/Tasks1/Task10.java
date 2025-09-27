public class Task10 {

    public static int tables(int students, int desks) {
        int requiredDesks = (students + 1) / 2;
        
        if (requiredDesks - desks > 0) {
            return requiredDesks - desks;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println(tables(5, 2));
        System.out.println(tables(31, 20));
        System.out.println(tables(123, 58));
    }
}