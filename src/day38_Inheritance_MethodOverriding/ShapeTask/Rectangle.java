package day38_Inheritance_MethodOverriding.ShapeTask;

public class Rectangle extends Shape {

    public double length;
    public double width;

    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double area() {
        return length * width;
    }

    public double perimeter() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", name='" + name + '\'' +
                "} " + super.toString();
    }
}
