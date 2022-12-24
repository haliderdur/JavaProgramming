package day41_Exceptions;

import day37_Inheritance.scrumTask.Tester;

import java.io.FileInputStream;

public class Checked_vs_Unchecked {

    public static void main(String[] args) {


        // unchecked exception: compiler can not check the code during the compile time but we can get exception during the run time

        int a = 10;
        int b = 0;

        // System.out.println(a / b);
        // System.out.println("Wooden Spoon");

        // char[] characters = {'A', 'B', 'C'};
        // System.out.println(characters[99]);

        // Tester tester = null;
        // System.out.println(tester.getName());

        //String str = "Wooden Spoon";
        //str = null;
        //System.out.println(str.toUpperCase());


        // checked exception: compiler can check the code during the compile time

        System.out.println("Hello");
        // Thread.sleep(3000);
        System.out.println("World");

        // FileInputStream file = new FileInputStream("path of the file");

    }

}
