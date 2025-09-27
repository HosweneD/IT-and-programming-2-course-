public class Task4 {
    public static String triangleType(int x, int y, int z) {
        
        if (x + y <= z || x + z <= y || y + z <= x) {
            return "not a triangle";
        }
        
        if (x == y && y == z) {
            return "isosceles";
        } else if (x == y || x == z || y == z) {
            return "equilateral";
        } else {
            return "different-sided";
        }
    }
    
    public static void main(String[] args) {
        System.out.println(triangleType(5, 5, 5));
        System.out.println(triangleType(5, 4, 5));
        System.out.println(triangleType(3, 4, 5));
        System.out.println(triangleType(5, 1, 1));
    }
}