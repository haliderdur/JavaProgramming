package day11_Switch_Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {

        double salary = 100_000;
        boolean isMarried = true;
        double taxRate = 0;  // temporary value

        if (salary >= 130_000) {
            taxRate = 0.35; // 35%
        } else if (salary >= 100_000) {
            taxRate = 0.30; // 30%
        } else if (salary >= 80_000) {
            taxRate = 0.25; // 25%
        } else {
            taxRate = 0.20; // 20%
        }
        if (isMarried) { // if the person is married
            taxRate -= 0.05; // subtracting 5% tax if the person is married
        }
        double salaryAfterTax = salary - (salary * taxRate);
        System.out.println("Salary After Tax = " + salaryAfterTax);
    }
}
