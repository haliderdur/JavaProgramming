package day42_Exceptions;

// 1. Do 30 push-ups and try pausing 1.5 seconds in each
// 2. Do 20 pull-ups and try pausing 2.5 seconds in each

public class MorningWorkOut {

    public static void sleep(double seconds) {
        try {
            Thread.sleep((long) (seconds * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        System.out.println("Push up started");

        for (int i = 1; i <= 30; i++) {
            System.out.print("\rpush up " + i);
            sleep(1.5);
        }

        System.out.println();
        System.out.println("Push up completed");

        System.out.println("------------------------------------------------------------------");

        System.out.println("Pull up started");

        for (int i = 1; i <= 20; i++) {
            System.out.print("\rpull up " + i);
            sleep(2.5);
        }

        System.out.println();
        System.out.println("Pull up completed");
    }

}
