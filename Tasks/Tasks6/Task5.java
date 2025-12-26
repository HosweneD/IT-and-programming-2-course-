import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        scanner.close();
        
        int[] result = isExact(num);
        
        if (result.length == 0) {
            System.out.println("[]");
        } else {
            System.out.println("[" + result[0] + ", " + result[1] + "]");
        }
    }

    public static int[] isExact(int num) {
        return isExactRecursive(num, 1, 1);
    }
    
    private static int[] isExactRecursive(int target, int current, int n) {
        if (current == target) {
            return new int[]{target, n};
        } else if (current > target) {
            return new int[0];
        } else {
            return isExactRecursive(target, current * (n + 1), n + 1);
        }
    }
}