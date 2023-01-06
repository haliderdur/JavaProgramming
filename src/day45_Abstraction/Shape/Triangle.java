package day45_Abstraction.Shape;

public class Triangle extends Shape {

    private double side1, side2, side3;
    private double side1Height;

    public Triangle(double side1, double side2, double side3, double side1Height) {
        super("Triangle");
        setSide1(side1);
        setSide2(side2);
        setSide3(side3);
        setSide1Height(side1Height);
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    public double getSide1Height() {
        return side1Height;
    }

    public void setSide1(double side1) {
        if (side1 < 0) {
            throw new RuntimeException("Side length can not be negative or zero: " + side1);
        }
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        if (side1 < 0) {
            throw new RuntimeException("Side length can not be negative or zero: " + side2);
        }
        this.side2 = side2;
    }

    public void setSide3(double side3) {
        if (side1 < 0) {
            throw new RuntimeException("Side length can not be negative or zero: " + side3);
        }
        this.side3 = side3;
    }

    public void setSide1Height(double side1Height) {
        if (side1 < 0) {
            throw new RuntimeException("Heigth can not be negative or zero: " + side1Height);
        }
        this.side1Height = side1Height;
    }

    @Override
    public double area() {
        return (side1 * side1Height) / 2;
    }

    @Override
    public double perimeter() {
        return side1 + side2 + side3;
    }
}
