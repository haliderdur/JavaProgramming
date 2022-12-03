package day32_ConstructorOverloading.day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {
    public static void main(String[] args) {


        Car car1 = new Car();
        car1.setInfo("Volkswagen", "Golf", "Black", 2015, 13300.00);
        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("Mercedes", "AMG", "White", 2017, 16200.00);
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Audi", "A3", "Grey", 2013, 12700.00);
        System.out.println(car3);

        ArrayList<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(car1, car2, car3));

        for (Car eachCar : carList) {
            System.out.println(eachCar.brand + " : " + eachCar.price);
        }

        System.out.println("------------------------------------------------------------------------------");

        /*
        Recall cars:
                Mercedes: 2002 - 2005
                Audi: 2000 - 2004
         */
        carList.removeIf(p -> p.brand.equals("Mercedes") && p.year >= 2002 && p.year <= 2005);
        carList.removeIf(p -> p.brand.equals("Audi") && p.year >= 2000 && p.year <= 2004);


    }
}
