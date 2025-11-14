package Tasks.Tasks2;

import java.util.Scanner;

public class Task3 {
    public static int sumOfPositives(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num > 0) {
                sum += num;
            }
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        
        String[] numbersStr = input.split(",");
        int[] numbers = new int[numbersStr.length];
        
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i].trim());
        }
        
        int result = sumOfPositives(numbers);
        System.out.println(result);
        
        scanner.close();
    }
}