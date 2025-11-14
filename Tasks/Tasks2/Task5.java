package Tasks.Tasks2;

import java.util.Scanner;

public class Task5 {
    public static int[] rotateRight(int[] arr, int k) {
        if (arr.length == 0) {
            return new int[0];
        }
        
        int effectiveK = k % arr.length;
        if (effectiveK == 0) {
            return arr.clone();
        }
        
        int[] result = new int[arr.length];
        
        for (int i = 0; i < effectiveK; i++) {
            result[i] = arr[arr.length - effectiveK + i];
        }
        
        for (int i = effectiveK; i < arr.length; i++) {
            result[i] = arr[i - effectiveK];
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine().trim();
        
        int bracketIndex = input.indexOf(']');
        
        String arrayStr = input.substring(1, bracketIndex).trim();
        String kStr = input.substring(bracketIndex + 1).trim();
        
        if (kStr.startsWith(",")) {
            kStr = kStr.substring(1).trim();
        }
        
        int[] array;
        if (arrayStr.isEmpty()) {
            array = new int[0];
        } else {
            String[] numbersStr = arrayStr.split(",");
            array = new int[numbersStr.length];
            for (int i = 0; i < numbersStr.length; i++) {
                array[i] = Integer.parseInt(numbersStr[i].trim());
            }
        }
        
        int k = Integer.parseInt(kStr);
        
        int[] result = rotateRight(array, k);
        
        System.out.print("[");
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
            if (i < result.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        
        scanner.close();
    }
}