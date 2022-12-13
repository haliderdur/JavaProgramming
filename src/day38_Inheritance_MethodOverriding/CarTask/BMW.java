package day38_Inheritance_MethodOverriding.CarTask;

public class BMW extends Car {

    public BMW(String model, int year, double price, String color, int miles) {
        super("BMW", model, year, price, color, miles);
    }

    public void breakDown() {
        System.out.println(brand + " " + model + " breaks down in every 200 miles");
    }

    public void racing() {
        System.out.println(brand + " " + model + " is a racing car");
    }

    @Override
    public void start() {
        System.out.println("Push the start button to start " + brand + " " + model);
    }
}
