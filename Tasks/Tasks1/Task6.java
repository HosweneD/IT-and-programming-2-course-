public class Task6 {
    
    public static int howManyItems(double n, double w, double h) {
        return (int)((n*2) / (w*h));
    }

    public static void main(String[] args) {
        System.out.println(howManyItems(22, 1.4, 2));
    }
}