package day08_IfStatements;

/*
Write a program that can display if the person is eligible to drive a car

    health  - blind or not
    license
    age

 */
public class HalidTest2 {
    public static void main(String[] args) {

        boolean healthy = false;
        boolean license = false;
        int age = 2;

        boolean isEligibleToDrive = healthy == false && license == true && age >= 18;

        System.out.println(isEligibleToDrive);


    }
}
