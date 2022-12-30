package day43_Abstraction.car;

public final class Honda extends Car {

    public Honda(String model, int year, String color, double price) {
        super("Honda", model, year, color, price);
    }

    public void start() {
        System.out.println("Twist the key to ignition");
    }


}
