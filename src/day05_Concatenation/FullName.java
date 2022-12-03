package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Halid";
        String lastName = "Erdur";
        int age = 32;
        String jobTitle = "SDET";
        String companyName = "Google Inc";
        double salary = 120000.85;

        String fullName = firstName + " " + lastName;

        //Full name of the person is ____
        System.out.println("Full name of the person is " + fullName + ".");

        //___ is ___ years old.
        System.out.println(fullName + " is " + age + " years old.");

        //FullName is Jobtitle, works at CompanyName and fullname's salary is salary
        System.out.println(fullName + " is " + jobTitle + ", works at " + companyName
                + " and " + fullName + "'s salary is " + salary + "$.");

    }
}
