package day37_Inheritance.scrumTask;

public class Employee extends Person {

    private String jobTitle;
    private int id;
    private double salary;
    private String companyName;

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary <= 0) {
            System.err.println("Invalid salary");
            System.exit(1);
        }
        this.salary = salary;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Employee(String name, int age, char gender, String jobTitle, int id, double salary, String companyName) {
        super(name, age, gender);
        setJobTitle(jobTitle);
        setId(id);
        setSalary(salary);
        setCompanyName(companyName);
    }

    public void work() {
        System.out.println(jobTitle + " " + getName() + " is working");
    }

    public String toString() {
        return "Employee{" +
                " name= " + getName() +
                ", age= " + getAge() +
                ", gender= " + getGender() +
                ", id= " + getId() +
                ", jobTitle= " + getJobTitle() +
                ", salary= $" + getSalary() +
                ", companyName= " + getCompanyName() +
                "} ";
    }
}
