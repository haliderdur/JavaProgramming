package day43_Abstraction.employee;

public final class Developer extends Employee {

    public Developer(String name, int age, char gender, long id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    @Override
    public void sleep() {
        System.out.println(getName() + " sleeps 7 hours");
    }

    @Override
    public void work() {
        System.out.println(getName() + " is coding");
    }

    public void unitTesting() {
        System.out.println(getName() + " is unit testing");
    }
}
