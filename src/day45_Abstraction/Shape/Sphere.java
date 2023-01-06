package day45_Abstraction.Shape;

public class Sphere extends Shape implements Volume {

    private double radius;
    private final static double PI = 3.14;

    public Sphere(double radius) {
        super("Sphere");
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Invalid radius: " + radius);
        }
        this.radius = radius;
    }

    @Override
    public double area() {
        return 4 * PI * (radius * radius);
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double volume() {
        return 4 / (3 * PI * (radius * radius));
    }
}
