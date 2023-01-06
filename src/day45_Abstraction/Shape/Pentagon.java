package day45_Abstraction.Shape;

public class Pentagon extends Shape {

    private double length, apothem;

    public Pentagon(double length, double apothem) {
        super("Pentagon");
        setLength(length);
        setApothem(apothem);
    }

    public double getLength() {
        return length;
    }

    public double getApothem() {
        return apothem;
    }

    public void setLength(double length) {
        if (length <= 0) {
            throw new RuntimeException("Invalid length: " + length);
        }
        this.length = length;
    }

    public void setApothem(double apothem) {
        if (apothem <= 0) {
            throw new RuntimeException("Invalid apothem: " + apothem);
        }
        this.apothem = apothem;
    }

    @Override
    public double area() {
        return (perimeter() * apothem) / 2;
    }

    @Override
    public double perimeter() {
        return 5 * length;
    }
}
