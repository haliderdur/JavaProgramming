package day43_Abstraction.employee;

public abstract class Tester extends Employee {

    public Tester(String name, int age, char gender, long id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 8 hours");
    }

    @Override
    public void work() {
        System.out.println(getName() + " is testing the application");
    }

    public void bugReport() {
        System.out.println(getName() + " is creating bug reports");
    }
}
