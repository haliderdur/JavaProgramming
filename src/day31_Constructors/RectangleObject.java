package day31_Constructors;

public class RectangleObject {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle(5.2, 4.8);
        Rectangle rectangle2 = new Rectangle(2.5, 10.5);
        System.out.println("rectangle1 = " + rectangle1);
        System.out.println("rectangle2 = " + rectangle2);

        System.out.println("Rec1 Area: " + rectangle1.calculateArea());
        System.out.println("Rec1 Perimeter: " + rectangle1.calculatePerimeter());

        rectangle1.width = 2;
        System.out.println("Rec1 new Area: " + rectangle1.calculateArea());
        System.out.println("Rec1 new Perimeter: " + rectangle1.calculatePerimeter());
    }
}
