public class Task8 {
    
    public static int gcd(int a, int b) {
        int result = 0;
        for (int i = 1; i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                result = i;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(gcd(48, 18));
        System.out.println(gcd(52, 8));
        System.out.println(gcd(259, 28));
    }
}