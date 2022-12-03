package day04_Variables;

// Create a class named Rectangle, write a program that can calculate the area & perimeter of any given rectangle


public class Rectangle {
    public static void main(String[] args) {

        double lenght = 5;
        double width = 8.5;

        double area = lenght * width;
        double perimeter = 2*(lenght+width);

        System.out.println("lenght = cm " + lenght);
        System.out.println("width = cm " + width);
        System.out.println("area cm = " + area);
        System.out.println("perimeter = cm " + perimeter);



    }
}
