package Tasks.Tasks2;

import java.util.Scanner;

public class Task8 {
    public static int diagonalSum(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String input = scanner.nextLine().trim();
        
        String content = input.substring(2, input.length() - 2);
        
        String[] rows = content.split("\\],\\[");
        int n = rows.length;
        int[][] matrix = new int[n][n];
        
        for (int i = 0; i < n; i++) {
            String[] elements = rows[i].split(",");
            if (elements.length != n) {
                scanner.close();
                return;
            }
                
            for (int j = 0; j < n; j++) {
                matrix[i][j] = Integer.parseInt(elements[j].trim());
            }
        }
            
            int result = diagonalSum(matrix);
            System.out.println(result);
            
        
        scanner.close();
    }
}