package day45_Abstraction.Shape;

public class Circle extends Shape {

    private double radius;
    private final static double PI;

    public Circle(double radius) {
        super("Circle");
        setRadius(radius);
    }

    static {
        PI = 3.14;
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

    @Override
    public double area() {
        return PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                "{" + super.toString() +
                ", radius=" + radius + "}";
    }
}
