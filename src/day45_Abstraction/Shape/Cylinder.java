package day45_Abstraction.Shape;

public class Cylinder extends Shape implements Volume {

    private double radius, height;
    private final static double PI = 3.14;

    public Cylinder(double radius, double height) {
        super("Cylinder");
        setRadius(radius);
        setHeight(height);
    }

    public double getRadius() {
        return radius;
    }

    public double getHeight() {
        return height;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Invalid radius length: " + radius);
        }
        this.radius = radius;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new RuntimeException("Invalid height: " + height);
        }
        this.height = height;
    }

    @Override
    public double area() {
        return (2 * PI * radius) * (radius + height);
    }

    @Override
    public double perimeter() {
        return 2 * ((2 * radius) + height);
    }

    @Override
    public double volume() {
        return height * PI * (radius * radius);
    }
}
