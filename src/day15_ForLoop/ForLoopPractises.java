package day15_ForLoop;

public class ForLoopPractises {
    public static void main(String[] args) {

        // 15 16 17 18 .... 45

        /*
        System.out.print(15);
        System.out.print(16);
        ....
        System.out.print(45);
         */

        for (int i = 15; i <= 45; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");

        // 100 99 98 97 ..... 50

        for (int i = 100; i >= 50; i--) {   //  i = 100 99 98 ... 50
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");

        // print all the even numbers between 1 ~ 55

        for (int i = 1; i <= 55; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");

        // print all the even numbers between 1 ~ 55

        for (int i = 2; i <= 55; i += 2) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");

        /*
        A~Z
        a~z
        Z`A
        z~a
         */

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");

        for (char i = 'Z'; i >= 'A'; i--) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-----------------------------------------------------------------------------------------");

        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }


    }
}
