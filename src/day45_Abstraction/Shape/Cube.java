package day45_Abstraction.Shape;

public class Cube extends Shape implements Volume {

    private double side;

    public Cube(double side) {
        super("Cube");
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            throw new RuntimeException("Invalid side length: " + side);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return 6 * (side * side);
    }

    @Override
    public double perimeter() {
        return 12 * side;
    }

    @Override
    public double volume() {
        return side * side * side;
    }
}
