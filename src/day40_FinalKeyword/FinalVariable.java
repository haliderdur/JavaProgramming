package day40_FinalKeyword;

public class FinalVariable {

    final String birthDay;

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    public static void main(String[] args) {

        final double pi = 3.14;

        // pi = 5.45;
        // pi = 8.2;


        final String name;

        name = "Java";
        // name = "Wooden Spoon";

        System.out.println("------------------------------------------------------------");


        FinalVariable obj = new FinalVariable("June/08");

        // obj.birthDay = "May/08";  // final variables can not be reassigned
        System.out.println(obj.birthDay);


    }
}
