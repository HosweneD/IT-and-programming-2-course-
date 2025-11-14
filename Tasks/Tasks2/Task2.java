package Tasks.Tasks2;

import java.util.Scanner;

public class Task2 {
     public static int sumRange(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += i;
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        String[] parts = input.split(",");
        
        int a = Integer.parseInt(parts[0].trim());
        int b = Integer.parseInt(parts[1].trim());
        
        int result = sumRange(a, b);
        
        System.out.println(result);
        
        scanner.close();
    }
}