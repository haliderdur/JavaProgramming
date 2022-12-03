package day36_Inheritance.employeeTask;

public class Developer extends Employee {

    public void coding() {
        System.out.println(name + " is coding");
    }

    public void bugFix() {
        System.out.println(name + " is fixing the bug");
    }
}
