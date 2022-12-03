package day31_Constructors.scrumTask;

public class Tester {
    public String name, jobTitle;
    public double salary;
    public long employeeID;

    public Tester(String name, String jobTitle, double salary, long employeeID) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.employeeID = employeeID;
    }

    public String toString() {
        return "Tester{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= $" + salary +
                ", employeeID=" + employeeID +
                '}';
    }

    public void smokeTesting() {
        System.out.println(name + " is responsible for smoke testing");
    }

    public void creatingTicket() {
        System.out.println(name + " is responsible for creating tickets");
    }

    public void dailyStandUp() {
        System.out.println(name + " is responsible to attend daily stand-up meeting");
    }
}
