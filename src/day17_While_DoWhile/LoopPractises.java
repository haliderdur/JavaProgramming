package day17_While_DoWhile;

public class LoopPractises {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        System.out.println("---------------");

        int a = 1;
        while (a <= 10) {
            System.out.println(a);
            a++;
        }

        System.out.println("---------------");

        int b = 1;
        do {
            System.out.println(b);
            b++;
        } while (b <= 10);
    }

}

