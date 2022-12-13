package day38_Inheritance_MethodOverriding.ShapeTask;

public class ShapeTest {

    public static void main(String[] args) {

        Square square = new Square(8);

        Rectangle rectangle = new Rectangle(4, 10);

        Circle circle = new Circle(5);

        System.out.println(square);
        System.out.println("Area of " + square.getName() + ": " + square.area());
        System.out.println("Perimeter of " + square.getName() + ": " + square.perimeter());

        System.out.println();

        System.out.println(rectangle);
        System.out.println("Area of " + rectangle.getName() + ": " + rectangle.area());
        System.out.println("Perimeter of " + rectangle.getName() + ": " + rectangle.perimeter());

        System.out.println();

        System.out.println(circle);
        System.out.println("Area of " + circle.getName() + ": " + circle.area());
        System.out.println("Perimeter of " + circle.getName() + ": " + circle.perimeter());


    }


}
