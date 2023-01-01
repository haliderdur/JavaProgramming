package day43_Abstraction.shape;

public class Circle extends Shape {

    private double radius;
    private final double PI;

    public Circle(String name, double radius, double PI) {
        super(name);
        setRadius(radius);
        this.PI = 3.14;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Radius can not be negative or zero: " + radius);
        }
        this.radius = radius;
    }

    public double getPI() {
        return PI;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }
}
