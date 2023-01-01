package day43_Abstraction.employee;

public class EmployeeObjects {

    public static void main(String[] args) {

        // Person person = new Person("Josh", 35, 'M');  // we can not create an object from abstract classes
        // Employee employee = new Employee("Jack", 40, 'M', 2255, "Employee", 150000); // we can not create an object from abstract classes

        Developer developer1 = new Developer("Jack", 35, 'M', 3535, "Java Developer", 1350000);
        Tester tester1 = new Tester("Halid", 33, 'M', 1223, "SDET", 125000);
        Teacher teacher1 = new Teacher("Nathalie", 36, 'F', 6556, "English Teacher", 115000);
        Driver driver1 = new Driver("Alex", 45, 'M', 8877, "Truck Driver", 100000);

        System.out.println(developer1);
        System.out.println(tester1);
        System.out.println(teacher1);
        System.out.println(driver1);

        developer1.work();
        developer1.sleep();
        developer1.eat();
        developer1.unitTesting();
        // developer1.bugReport();

        tester1.work();
        tester1.sleep();
        tester1.eat();
        tester1.bugReport();
        // tester1.unitTesting();

        teacher1.work();
        teacher1.sleep();
        teacher1.eat();
        // teacher1.bugReport();

        driver1.work();
        driver1.sleep();
        driver1.eat();

    }
}
