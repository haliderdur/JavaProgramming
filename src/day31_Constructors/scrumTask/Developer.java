package day31_Constructors.scrumTask;

public class Developer {
    public String name, jobTitle;
    public double salary;
    public long employeeID;

    public Developer(String name, String jobTitle, double salary, long employeeID) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", employeeID=" + employeeID +
                '}';
    }

    public void coding() {
        System.out.println(name + " is coding");
    }

    public void unitTesting() {
        System.out.println(name + " is unit testing");
    }

    public void fixingBug() {
        System.out.println(name + " is fixing bugs");
    }
}

