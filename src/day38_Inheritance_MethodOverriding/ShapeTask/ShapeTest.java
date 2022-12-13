package day38_Inheritance_MethodOverriding.ShapeTask;

public class ShapeTest {

    public static void main(String[] args) {

        Square square = new Square(5);

        Rectangle rectangle = new Rectangle(4, 10);

        Circle circle = new Circle(3);

        System.out.println(square);
        System.out.println("Area of " + square.name + ": " + square.area());
        System.out.println("Perimeter of " + square.name + ": " + square.perimeter());

        System.out.println();

        System.out.println(rectangle);
        System.out.println("Area of " + rectangle.name + ": " + rectangle.area());
        System.out.println("Perimeter of " + rectangle.name + ": " + rectangle.perimeter());

        System.out.println();

        System.out.println(circle);
        System.out.println("Area of " + circle.name + ": " + circle.area());
        System.out.println("Perimeter of " + circle.name + ": " + circle.perimeter());


    }


}
