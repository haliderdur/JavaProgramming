package day43_Abstraction.employee;

public abstract class Employee extends Person {

    private final long id;
    private String jobTitle;
    private double salary;

    public Employee(String name, int age, char gender, long id, String jobTitle, double salary) {
        super(name, age, gender);
        if (id <= 0) {
            throw new RuntimeException("Invalid ID: " + id);
        }
        this.id = id;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public long getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            throw new RuntimeException("Invalid salary: " + salary);
        }
        this.salary = salary;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public abstract void work();

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + getName() + '\'' +
                ", age=" + getAge() +
                ", gender=" + getGender() +
                ", jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary= $" + salary +
                "}";
    }
}
