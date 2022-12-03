package day04_Variables;

/*
Create a class named Circle, write a program that can calculate the area & perimeter of any given Circle
PI, radius, diameter, area, perimeter
Hints: PI = 3.14
area = radius * radius * PI
Perimeter = 2 * radius * PI (diameter * PI)
 */

public class Circle {
    public static void main(String[] args) {

        double radius = 5.5;
        double PI = 3.14;
        double diameter = radius * 2;

        double area = radius * radius * PI;
        double perimeter = diameter * PI;

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);


    }
}
