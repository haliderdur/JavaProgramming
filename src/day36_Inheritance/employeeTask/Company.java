package day36_Inheritance.employeeTask;

public class Company {
    public static void main(String[] args) {

        Developer developer1 = new Developer();
        developer1.setInfo("Kate", "developer", "Apple", 'F', 30, 2255, 135_000);

        System.out.println(developer1);

        developer1.work();
        developer1.coding();
        developer1.bugFix();

        System.out.println();

        Tester tester1 = new Tester();
        tester1.setInfo("Halid", "SDET", "Amazon", 'M', 33, 7788, 110_000);

        System.out.println(tester1);

        tester1.work();
        tester1.regressionTesting();
        tester1.smokeTesting();
        tester1.creatingTestCase();

        System.out.println();


        Driver driver1 = new Driver();
        driver1.setInfo("Nuno", "driver", "Cognizant", 'M', 45, 2323, 55_000);

        System.out.println(driver1);

        driver1.work();
        driver1.drive();

    }
}
