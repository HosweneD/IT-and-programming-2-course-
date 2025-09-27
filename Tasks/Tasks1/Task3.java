public class Task3 {
    public static void main(String[] args) {
        System.out.println(containers(3, 4, 2));
        System.out.println(containers(5, 0, 2));
        System.out.println(containers(4, 1, 4));
    }

    public static int containers(int boxes, int bags, int barrels) {
        return boxes*20 + bags*50 + barrels*100;
    }
}