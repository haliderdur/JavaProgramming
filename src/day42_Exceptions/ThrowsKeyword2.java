package day42_Exceptions;

public class ThrowsKeyword2 {

    public static void main(String[] args) {

        System.out.println("Test started");

        try {
            System.out.println(8 / 0);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }

        System.out.println("Test completed");

    }
}
