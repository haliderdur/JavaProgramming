package day08_IfStatements;

/*
Create a class named SalaryCalculator
    1.Declare the following variables;
        hourlyRate, weeklyHours, stateTaxRate, socialSecurityTaxRate

    2.Use the given info in above variables to calculate the followings;
        salaryBeforeTax
        stateTax
        socialSecurityTax
        totalTax
        salaryAfterTax

        Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

    3. Use print statement to print each of the above
        Gross Pay
        State Tax
        Social Security Tax
        Total Tax
        Net Income

 */
public class SalaryCalculator {
    public static void main(String[] args) {

        int hourlyRate = 23;
        int weeklyHours = 40;
        double stateTaxRate = 22.3;
        double socialSecurityTaxRate = 13.5;

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;
        double stateTax = salaryBeforeTax * stateTaxRate / 100;
        double socialSecurityTax = salaryBeforeTax * socialSecurityTaxRate / 100;
        double totalTax = stateTax + socialSecurityTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross Pay is $" + salaryBeforeTax);
        System.out.println("State Tax is $" + stateTax);
        System.out.println("Social Security Tax is $" + socialSecurityTax);
        System.out.println("Total Tax is $" + totalTax);
        System.out.println("Net income is $" + salaryAfterTax);


    }
}
