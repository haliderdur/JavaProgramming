package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;

public class Circle {

    public double radius;
    public static double pi = 3.14;
    public static String name = "Circle";
    public static ArrayList<Integer> numbers;


    public Circle(double radius) { // we need constructor to set instance variable
        this.radius = radius;
        // pi = 3.14; - static variable , no need to use in constructor. use only instance variables
    }


    static { // we need static block to set static variable
        // radius = 5; - instance variable, we can not use instance variables in static block. only static variable can be used in static block
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
    }
    /*
    public static void main(String[] args) {
        pi = 3.14;
        name = "Circle";
        numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);

        System.out.println("pi = " + pi);
        System.out.println("name = " + name);
        System.out.println("numbers = " + numbers);
    }
    */
}
