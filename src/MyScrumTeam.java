/*
Scrum Task:

create a class called Tester
        Attributes:
            name, employeeID, JobTitle, Salary
        Add A constructor that can set all the fields

        Actions:
           smokeTesting(),  creatingTicket(), dailyStandUp() toString()

create a class called Developer
          Attributes:
            name, employeeID, JobTitle, Salary
          Add A constructor that can set all the fields

          Actions:
            coding(), unitTesting(), fixingBug(), toString()

create a class called ScrumTeam
           Attributes:
                String PO, BA, SM;
                ArrayList<Tester> testersList = new ArrayList<>();
                ArrayList<Developer> devopsList = new ArrayList<>();
                int daysOfSprint;
               Add A constructor that can set the fields PO, BA, and SM

           Actions:
                  addTester(Tester tester): adds the given tester to the testers ArrayList
                  addTesters(Tester[] testers): adds the given testers to the testers ArrayList
                  addDeveloper(Developer developer): adds the given developer to the developers ArrayList
                  addDevelopers(Developer[] developers): adds the given developers to the developers ArrayList
                  removeTester(long employeeID): removes the given tester from the testers ArrayList
                  removeDeveloper(long employeeID): removes the developer from the developers ArrayList
                  toString(): prints number of tester,& developers,  PO name, SM name, BA name

create a class called MyScrumTeam:
                    1. create an array of Testers and add the testers from your group
                    2. create an array of developers add the developers from your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {

        // 3 testers object
        day31_Constructors.scrumTask.Tester tester1 = new day31_Constructors.scrumTask.Tester("Halid", "SDET", 120000, 1155);
        day31_Constructors.scrumTask.Tester tester2 = new day31_Constructors.scrumTask.Tester("Salim", "SE", 110000, 1166);
        day31_Constructors.scrumTask.Tester tester3 = new day31_Constructors.scrumTask.Tester("Gorkem", "QA", 105000, 1144);

        day31_Constructors.scrumTask.Tester[] testers = {tester2, tester3};

        // 4 developers object
        day31_Constructors.scrumTask.Developer dev1 = new day31_Constructors.scrumTask.Developer("Yavuz", "Java Dev", 125000, 7711);
        day31_Constructors.scrumTask.Developer dev2 = new day31_Constructors.scrumTask.Developer("Alex", "Java Master", 155000, 7722);
        day31_Constructors.scrumTask.Developer dev3 = new day31_Constructors.scrumTask.Developer("Erica", "Software Dev", 130000, 7733);
        day31_Constructors.scrumTask.Developer dev4 = new day31_Constructors.scrumTask.Developer("Elena", "Senior Dev", 175000, 7744);

        day31_Constructors.scrumTask.Developer[] devs = {dev2, dev3, dev4};

        // 1 Scrum Team object
        day31_Constructors.scrumTask.ScrumTeam scrumTeam = new day31_Constructors.scrumTask.ScrumTeam("Fatih", "Ashley", "Alan", 14);


        scrumTeam.addTester(tester1);
        scrumTeam.addDeveloper(dev1);

        scrumTeam.addTesters(testers);
        scrumTeam.addDevelopers(devs);

        System.out.println(scrumTeam);

        System.out.println("-------------------------------------------------------------------------------------");

        for (day31_Constructors.scrumTask.Tester eachTester : scrumTeam.testersList) {
            System.out.println(eachTester.jobTitle + " " + eachTester.name + " : " + eachTester.salary);
        }
        System.out.println("-------------------------------------------------------------------------------------");
        for (day31_Constructors.scrumTask.Developer eachDeveloper : scrumTeam.devopsList) {
            System.out.println(eachDeveloper.jobTitle + " " + eachDeveloper.name + " : " + eachDeveloper.salary);
        }
        System.out.println("-------------------------------------------------------------------------------------");
        scrumTeam.removeTester(1144);
        System.out.println(scrumTeam);

        scrumTeam.removeDeveloper(7733);
        System.out.println(scrumTeam);

    }
}

class Tester {
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

class Developer {
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

class ScrumTeam {
    public String PO, BA, SM;
    public ArrayList<day31_Constructors.scrumTask.Tester> testersList = new ArrayList<>();
    public ArrayList<day31_Constructors.scrumTask.Developer> devopsList = new ArrayList<>();
    public int daysOfSprint;

    public ScrumTeam(String PO, String BA, String SM, int daysOfSprint) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;
        this.daysOfSprint = daysOfSprint;
    }

    public void addTester(day31_Constructors.scrumTask.Tester tester) {
        testersList.add(tester);
    }

    public void addTesters(day31_Constructors.scrumTask.Tester[] testers) {
        testersList.addAll(Arrays.asList(testers));
    }

    public void addDeveloper(day31_Constructors.scrumTask.Developer developer) {
        devopsList.add(developer);
    }

    public void addDevelopers(day31_Constructors.scrumTask.Developer[] developers) {
        devopsList.addAll(Arrays.asList(developers));
    }

    public void removeTester(long employeeID) {
        testersList.removeIf(p -> p.employeeID == employeeID);
    }

    public void removeDeveloper(long employeeID) {
        devopsList.removeIf(p -> p.employeeID == employeeID);
    }

    public String toString() {
        return "ScrumTeam{" +
                "PO='" + PO + '\'' +
                ", BA='" + BA + '\'' +
                ", SM='" + SM + '\'' +
                ", total number of testers=" + testersList.size() +
                ", total number of developers=" + devopsList.size() +
                ", daysOfSprint=" + daysOfSprint +
                '}';
    }
}
