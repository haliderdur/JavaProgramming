package day43_Abstraction.employee;

public abstract class Employee extends Person {

    private String jobTitle;
    private final long id;
    private double salary;

    public Employee(String name, int age, char gender, String jobTitle, long id, double salary) {
        super(name, age, gender);
        this.jobTitle = jobTitle;
        this.id = id;
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
