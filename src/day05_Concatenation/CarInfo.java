package day05_Concatenation;

/*
Create a class called CarInfo.java and Declare the following variables:

1.year
2.make
3.model
4.miles
5.color
6.price

Use concatenation to print the full info of the car in the following format:
Year  Make  Model,  Miles,  Color,  Price.
Example:
2018 Toyota Camry, 50000 miles, Red, $19000.
 */

public class CarInfo {
    public static void main(String[] args) {

        int year = 2016,
                miles = 140000,
                price = 13500;
        String brand = "Wolksvagen",
                model = "Golf VII",
                color = "black";

        //   System.out.println(year + " " + brand + " " + model + ", "
        //           + miles + " miles, " + color + ", $" + price + ".");

        String carInfo = year + " " + brand + " " + model + ", "
                + miles + " miles, " + color + ", $" + price + ".";
        System.out.println(carInfo);

    }
}
