package day08_IfStatements;

/*
write a program that can display age
 */
public class HalidTest {
    public static void main(String[] args) {

        String name = "Kerem";
        int currentYear = 2022;
        int birthYear = 2000;
        String citizen = "Portugal";
        int age = currentYear - (birthYear + 1);

        System.out.println(name);
        System.out.println(age);



        boolean isEligibleToVote = citizen == "Portugal" && age >= 18;

        if (isEligibleToVote) {
            System.out.println(name + " is eligible to vote in Portugal: " + isEligibleToVote);
        }
        if (!isEligibleToVote) {
            System.out.println(name + " is eligible to vote in Portugal: " + isEligibleToVote);
        }


    }
}
