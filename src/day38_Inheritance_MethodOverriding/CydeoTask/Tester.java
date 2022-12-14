package day38_Inheritance_MethodOverriding.CydeoTask;

public class Tester extends Employee {

    public Tester(String name, int age, char gender, int employeeID, String jobTitle, double salary) {
        super(name, age, gender, employeeID, jobTitle, salary);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " " + getName() + " is testing the software");
    }

    public void createTicket() {
        System.out.println(getJobTitle() + " " + getName() + " is preparing regression test suite");
    }
}
