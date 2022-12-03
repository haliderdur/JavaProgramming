package day32_ConstructorOverloading.day30_CustomClass;

public class Employee {

    public String name;
    public String jobTitle;
    public int ID;
    public char gender;
    public double salary;
    public boolean isFullTime;

    public void setInfo(String name, String jobTitle, int ID, char gender, double salary, boolean isFullTime) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.ID = ID;
        this.gender = gender;
        this.salary = salary;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", ID=" + ID +
                ", gender=" + gender +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                '}';
    }

    public void work() {
        System.out.println(name + " is working");
    }
}
