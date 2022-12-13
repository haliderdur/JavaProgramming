package day38_Inheritance_MethodOverriding.ShapeTask;

public class Circle extends Shape {

    public double radius;
    public static double PI = 3.14;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius * radius * PI;
    }

    @Override
    public double perimeter() {
        return 2 * radius * PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
