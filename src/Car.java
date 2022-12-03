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

class CarObjects {
    public static void main(String[] args) {

        day32_ConstructorOverloading.Car car1 = new day32_ConstructorOverloading.Car("Toyota");
        day32_ConstructorOverloading.Car car2 = new day32_ConstructorOverloading.Car("Honda", "Accord");
        day32_ConstructorOverloading.Car car3 = new day32_ConstructorOverloading.Car("Lexus", "RX350", "White");
        day32_ConstructorOverloading.Car car4 = new day32_ConstructorOverloading.Car("Mercedes", "AMG", "Black", 35000);
        day32_ConstructorOverloading.Car car5 = new day32_ConstructorOverloading.Car("BMW", "X6", "Blue", 30000, 2020);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
