package day43_Abstraction.car;

public abstract class Car {

    private final String brand, model;
    private final int year;
    private String color;
    private double price;

    public Car(String brand, String model, int year, String color, double price) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        if (year < 1886) {
            throw new RuntimeException("Invalid year: " + year);
        }
        setColor(color);
        setPrice(price);
    }


    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        if (price <= 0) {
            throw new RuntimeException("Invalid price: " + price);
        }
        this.price = price;
    }


    public void stop() {
        System.out.println("Apply the brake");
    }
    public abstract void start();

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", price= $" + price +
                '}';
    }
}