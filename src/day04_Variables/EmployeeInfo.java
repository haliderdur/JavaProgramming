package day04_Variables;

/*
Create a class named EmployeeInfo. declare the following variables:
1. name
2. age
3. gender
4. company
5. jobTitle
6. yearsOfExpereince
7. salary
8. isFullTime
9. isMarried
10. employeeId
11. SSN
 */
public class EmployeeInfo {
    public static void main(String[] args) {
        String name = "Halid";
        int age = 32;
        char gender = 'M';
        String company = "Google";
        String jobTitle = "SDET";
        double yearsOfExperience = 3.5;
        int salary = 45000;
        boolean isFullTime = true;
        boolean isMarried = false;
        int employeeID = 123123;  //if employee ID is mixed with some characters and numbers, then String instead int --> AB12345
        String SSN = "(123)-45-6789";


        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("company = " + company);
        System.out.println("jobTitle = " + jobTitle);
        System.out.println("yearsOfExperience = " + yearsOfExperience);
        System.out.println("salary = " + salary);
        System.out.println("isFullTime = " + isFullTime);
        System.out.println("isMarried = " + isMarried);
        System.out.println("employeeID = " + employeeID);
        System.out.println("SSN = " + SSN);


    }
}
