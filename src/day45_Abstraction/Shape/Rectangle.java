package day45_Abstraction.Shape;

public class Rectangle extends Shape {

    private double length, width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new RuntimeException("Invalid length: " + length);
        }
        this.length = length;
    }

    public void setWidth(double width) {
        if (length <= 0) {
            throw new RuntimeException("Invalid width: " + width);
        }
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return (length + width) * 2;
    }
}
