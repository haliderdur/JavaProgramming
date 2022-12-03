package day36_Inheritance.employeeTask;

public class Tester extends Employee {

    public void smokeTesting() {
        System.out.println(name + " is implementing a smoke test");
    }

    public void regressionTesting() {
        System.out.println(name + " is implementing a regression test");
    }

    public void creatingTestCase() {
        System.out.println(name + " is creating a test case");
    }
}
