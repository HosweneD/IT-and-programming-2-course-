public class Task9 {

    public static int ticketSaler(int ticketCount, int ticketPrice) {
        double commission = 0.28;
        return (int)(ticketCount * ticketPrice * (1 - commission));
    }

    public static void main(String[] args) {
        System.out.println(ticketSaler(70, 1500));
        System.out.println(ticketSaler(24, 950));
        System.out.println(ticketSaler(53, 1250));
    }
}