package day43_Abstraction.shape;

public class Rectangle extends Shape {

    private double lenght;
    private double width;

    public Rectangle(String name, double lenght, double width) {
        super(name);
        setLenght(lenght);
        setWidth(width);
    }

    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        if (lenght <= 0) {
            throw new RuntimeException("Length can not be negative or zero: " + lenght);
        }
        this.lenght = lenght;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new RuntimeException("Width can not be negative or zero: " + width);
        }
        this.width = width;
    }

    @Override
    public double area() {
        return lenght * width;
    }

    @Override
    public double perimeter() {
        return (lenght + width) * 2;
    }
}
