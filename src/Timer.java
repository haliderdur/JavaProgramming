import java.util.Scanner;

public class Timer {

    public static void main(String[] args) throws InterruptedException {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the number of minutes");
        int mins = input.nextInt();
        input.close();

        for (int i = mins; i > 0; i--) {
            for (int j = 59; j >= 0; j--) {
                System.out.print("\r" + (i - 1) + " minutes and " + j + " seconds left");
                Thread.sleep(1000);
            }
        }

        System.out.println();
        System.out.println();
        System.err.println("************************************************************************");
        System.err.println("*                            TIME IS UP                                *");
        System.err.println("************************************************************************");

    }

}