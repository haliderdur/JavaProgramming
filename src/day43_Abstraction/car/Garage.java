package day43_Abstraction.car;

public class Garage {

    public static void main(String[] args) {

        // Car car1 = new Car("Cydeo","Batch25","2022","Blue",10000);
        // we can not create object from abstract class, cuz abstract class cannot be instantiated

        Honda honda = new Honda("Accord", 2019, "Red", 20000);

        Audi audi = new Audi("Q7", 2021, "Blue", 45000);

        Tesla tesla = new Tesla("Model3", 2022, "White", 55000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);

        System.out.println("--------------------------------------------------------------");

        honda.setColor("Green");
        audi.setColor("Black");
        tesla.setColor("Grey");

        honda.setPrice(25000);
        audi.setPrice(40000);
        tesla.setPrice(58000);

        System.out.println(honda);
        System.out.println(audi);
        System.out.println(tesla);


    }
}
