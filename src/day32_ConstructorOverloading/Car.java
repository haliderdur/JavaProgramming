package day32_ConstructorOverloading;

/*
class name: Car
    instance variables:
           brand, model, year, price, color

    1st constructor: initializes the make ONLY
    2nd constructor: initializes make & model
        (MUST use constructor call to set the brand)
    3rd constructor: initializes make, model, year
        (MUST use constructor call to set the brand, model)
    4th constructor: initializes make, model, year, price
        (MUST use constructor call to set the brand, model, year)
    5th Constructor: intializes all the instances
        (MUST use constructor call to set the brand, mode, year, price, color)

    instance methods: toString
 */
public class Car {

    public String brand, model, color;
    public double price;
    public int year;

    public Car(String brand) {
        this.brand = brand;
    }

    public Car(String brand, String model) {
        this(brand);
        this.model = model;
    }

    public Car(String brand, String model, String color) {
        this(brand, model);
        this.color = color;
    }

    public Car(String brand, String model, String color, double price) {
        this(brand, model, color);
        this.price = price;
    }

    public Car(String brand, String model, String color, double price, int year) {
        this(brand, model, color, price);
        this.year = year;
    }

    public String toString() {
        return "Car{" +
                "brand= '" + brand + '\'' +
                ", model= '" + model + '\'' +
                ", color= '" + color + '\'' +
                ", price= $" + price +
                ", year= " + year +
                '}';
    }


}
