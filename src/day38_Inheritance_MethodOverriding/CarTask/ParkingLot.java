package day38_Inheritance_MethodOverriding.CarTask;

public class ParkingLot {

    public static void main(String[] args) {

        Toyota toyota = new Toyota("Camry", 2020, 20000, "red", 123456);

        Tesla tesla = new Tesla("Model S", 2021, 35000, "blue", 15123);

        BMW bmw = new BMW("520", 2022, 40000, "White", 0);

        toyota.start();
        tesla.start();
        bmw.start();
    }

}
