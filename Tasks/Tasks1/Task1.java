public class Task1 {
    public static void main(String[] args) {
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(8));
    }

    public static float convert(int gallons) {
        return (float)((float)gallons * 3.785);
    }
}