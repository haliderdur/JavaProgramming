package day38_Inheritance_MethodOverriding.ShapeTask;

public class Circle extends Shape {

    private double radius;
    public static double PI = 3.14;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

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
                "radius=" + getRadius() +
                ", PI=" + PI +
                ", name='" + getName() + '\'' +
                "} " + super.toString();
    }
}
