package day04_Variables;

public class SalaryCalculator {
    public static void main(String[] args) {
        //hourlyRate, weeklyHours

        int hourlyRate = 76;
        int weeklyHours = 40;
        int numberOfWeeks = 52; //52 weeks per annum

        int salary = hourlyRate * weeklyHours * numberOfWeeks;

        // System.out.println(salary);

        System.out.println("hourlyRate = $" + hourlyRate);
        System.out.println("weeklyHours = " + weeklyHours);
        System.out.println("numberOfWeeks = " + numberOfWeeks);
        System.out.println("salary = $" + salary);

    }


}
