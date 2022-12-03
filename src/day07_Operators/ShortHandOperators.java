package day07_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        // assignment:  =

        int number = 100;
        System.out.println("number = " + number);  // 100

        number = 200;  // new assignment to int variable
        System.out.println("number = " + number);  // 200

        String word = "Java Programming";
        System.out.println("word = " + word);  // Java Programming

        word = "Wooden Spoon";  // new assignment to String variable
        System.out.println("word = " + word);  // Wooden Spoon

        word = "Cydeo";
        System.out.println("word = " + word);

        System.out.println("------------------------------------------------------");

        // addition assignment: +=

        int x = 100;
        System.out.println("x = " + x);

        System.out.println(x + 200); // 300

        // x = x + 200;
        x += 200;
        System.out.println("x = " + x);

        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str);

        double num1 = 2.5;
        System.out.println("num1 = " + num1);
        num1 += 5.5;
        System.out.println("num1 = " + num1);

        double availableBalance = 1500.50;
        // deposit 500$
        availableBalance += 500;
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("------------------------------------------------------");

        // subtraction assignment: -=

        availableBalance -= 600; // withdrawing 600$
        System.out.println("availableBalance = " + availableBalance);

        // withdraw 200$, then deposit 400$
        availableBalance -= 200;
        availableBalance += 400;
        System.out.println("availableBalance = " + availableBalance);

        System.out.println("------------------------------------------------------");

        // multiplication assignment: *=

        double salary = 5000.5;
        System.out.println("salary = " + salary);
        salary *= 2;
        System.out.println("salary = " + salary);

        System.out.println("------------------------------------------------------");

        // division assignment: /=

        double num2 = 25000;
        num2 /= 2;
        System.out.println("num2 = " + num2);

        System.out.println("------------------------------------------------------");

        // remainder assignment: %=

        double num3 = 100;
        num3 %= 9;
        System.out.println("num3 = " + num3);

        System.out.println("------------------------------------------------------");

        int amount = 127;  // cents

        int quarters = amount / 25;
        int cents = amount % 25;

        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);

        System.out.println("-------------");

        int cents2 = 127;
        cents2 %= 25;

        System.out.println("cents2 = " + cents2);

        System.out.println("-------------");

        int y = 300;
        y /= 16;
        System.out.println("y = " + y);

        System.out.println("-------------");

        int balance = 3500;
        // insurance fee is 153$

        balance %= 153;  // to find how much money will remain in my balance eventually
        System.out.println("balance = " + balance);








    }
}
