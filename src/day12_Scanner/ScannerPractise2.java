package day12_Scanner;

import java.util.Scanner;

public class ScannerPractise2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = input.nextInt();

        System.out.println("Enter your height");
        double height = input.nextDouble();

        input.nextLine();

        System.out.println("Type your first and second name");
        String name = input.nextLine();

        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("name = " + name);

        input.close();

    }
}
