package day04_Variables;

/* Create a class named Square, write a program that can calculate the area & perimeter of any given square
side 3.52
*/

public class Square {
    public static void main(String[] args) {

        double side = 3.52;

        double area = side * side;
        double perimeter = 4 * side;

        System.out.println("side = cm " + side);
        System.out.println("area = cm " + area);
        System.out.println("perimeter = cm " + perimeter);

    }
}
