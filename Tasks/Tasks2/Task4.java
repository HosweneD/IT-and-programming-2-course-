package Tasks.Tasks2;

import java.util.Scanner;

public class Task4 {
    public static boolean hasDuplicates(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine();
        
        if (input.trim().isEmpty()) {
            System.out.println(false);
            scanner.close();
            return;
        }
        
        String[] numbersStr = input.split(",");
        int[] numbers = new int[numbersStr.length];
        
        for (int i = 0; i < numbersStr.length; i++) {
            numbers[i] = Integer.parseInt(numbersStr[i].trim());
        }
        
        boolean result = hasDuplicates(numbers);
        System.out.println(result);
        
        scanner.close();
    }
}
