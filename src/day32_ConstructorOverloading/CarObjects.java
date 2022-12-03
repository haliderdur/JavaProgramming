package day32_ConstructorOverloading;

public class CarObjects {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota");
        Car car2 = new Car("Honda", "Accord");
        Car car3 = new Car("Lexus", "RX350", "White");
        Car car4 = new Car("Mercedes", "AMG", "Black", 35000);
        Car car5 = new Car("BMW", "X6", "Blue", 30000, 2020);

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);
        System.out.println(car4);
        System.out.println(car5);
    }
}
