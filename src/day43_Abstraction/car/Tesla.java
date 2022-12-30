package day43_Abstraction.car;

public final class Tesla extends Car {

    public Tesla(String model, int year, String color, double price) {
        super("Tesla", model, year, color, price);
    }

    @Override
    public void start() {
        System.out.println("Say \"start\"");
    }

    public void autoPilot() {
        System.out.println(getBrand() + " " + getModel() + " has auto pilot feature");
    }
}
