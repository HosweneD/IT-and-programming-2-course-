import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine().trim();

        input = input.substring(2, input.length() - 2);

        String[] rows = input.split("\\],\\[");
        int n = rows.length;

        int[][] grid = new int[n][];
        for (int i = 0; i < n; i++) {
            String[] values = rows[i].split(",");
            grid[i] = new int[values.length];
            for (int j = 0; j < values.length; j++) {
                grid[i][j] = Integer.parseInt(values[j].trim());
            }
        }

        int result = countIslands(grid);
        System.out.println(result);
        
        scanner.close();
    }

    public static int countIslands(int[][] grid) {
        if (grid == null || grid.length == 0) {
            return 0;
        }

        int islands = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    islands++;
                    dfs(grid, i, j, rows, cols);
                }
            }
        }

        return islands;
    }

    private static void dfs(int[][] grid, int i, int j, int rows, int cols) {
        if (i < 0 || i >= rows || j < 0 || j >= cols || grid[i][j] == 0) {
            return;
        }
        
        grid[i][j] = 0;

        dfs(grid, i + 1, j, rows, cols);
        dfs(grid, i - 1, j, rows, cols);
        dfs(grid, i, j + 1, rows, cols);
        dfs(grid, i, j - 1, rows, cols);
    }
}