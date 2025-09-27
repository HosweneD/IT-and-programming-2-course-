public class Task7 {
    
    public static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number ; i++) {
            result = result * i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));
    }
}