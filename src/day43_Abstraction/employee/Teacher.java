package day43_Abstraction.employee;

public final class Teacher extends Employee {

    public Teacher(String name, int age, char gender, long id, String jobTitle, double salary) {
        super(name, age, gender, id, jobTitle, salary);
    }

    public void sleep() {
        System.out.println(getName() + " sleeps 6 hours");
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching");
    }
}
