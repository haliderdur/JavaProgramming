package day31_Constructors;

/*
Pizza Task:
    Attributes:
        size, numberofCheeseTopping, numberOfPepperoniTopping
        Add a constructor that can set all the fields

    Actions:
        calcCost(): returns the totalCost of the pizza
        toString():returns a String containing the pizza size, quantity of each topping, and the pizza cost as calculated by calcCost()
    Pizza cost is determined by:
        S: $10 + $2 per topping
        M: $12 + $2 per topping
        L: $14 + $2 per topping
 */
public class Pizza {
    public char size;
    public int numberOfCheeseTopping, numberOfPepperoniTopping;

    public Pizza(char size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }

    public double calcCost() {
        double total = 0;
        if (size == 'S') {
            total = 10 + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;
        }
        if (size == 'M') {
            total = 12 + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;
        }
        if (size == 'L') {
            total = 14 + (numberOfCheeseTopping + numberOfPepperoniTopping) * 2;
        }
        return total;
    }

    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", Total Price= $" + calcCost() +
                '}';
    }
}