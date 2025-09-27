public class Task5 {
    
    public static double ternaryEvaluation(double a, double b) {
        return (a > b ? a : b);
    }

    public static void main(String[] args) {
        System.out.println(ternaryEvaluation(8, 4));
        System.out.println(ternaryEvaluation(1, 11));
        System.out.println(ternaryEvaluation(10.2, 10.3));
    }
}