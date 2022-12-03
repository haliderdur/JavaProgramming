package day31_Constructors.scrumTask;

import java.util.ArrayList;
import java.util.Arrays;

public class MyScrumTeam {
    public static void main(String[] args) {

        // 3 testers object
        Tester tester1 = new Tester("Halid", "SDET", 120000, 1155);
        Tester tester2 = new Tester("Salim", "SE", 110000, 1166);
        Tester tester3 = new Tester("Gorkem", "QA", 105000, 1144);

        Tester[] testers = {tester2, tester3};

        // 4 developers object
        Developer dev1 = new Developer("Yavuz", "Java Dev", 125000, 7711);
        Developer dev2 = new Developer("Alex", "Java Master", 155000, 7722);
        Developer dev3 = new Developer("Erica", "Software Dev", 130000, 7733);
        Developer dev4 = new Developer("Elena", "Senior Dev", 175000, 7744);

        Developer[] devs = {dev2, dev3, dev4};

        // 1 Scrum Team object
        ScrumTeam scrumTeam = new ScrumTeam("Fatih", "Ashley", "Alan", 14);


        scrumTeam.addTester(tester1);
        scrumTeam.addDeveloper(dev1);

        scrumTeam.addTesters(testers);
        scrumTeam.addDevelopers(devs);

        System.out.println(scrumTeam);

        System.out.println("-------------------------------------------------------------------------------------");

        for (Tester eachTester : scrumTeam.testersList) {
            System.out.println(eachTester.jobTitle + " " + eachTester.name + " : " + eachTester.salary);
        }
        System.out.println("-------------------------------------------------------------------------------------");
        for (Developer eachDeveloper : scrumTeam.devopsList) {
            System.out.println(eachDeveloper.jobTitle + " " + eachDeveloper.name + " : " + eachDeveloper.salary);
        }
        System.out.println("-------------------------------------------------------------------------------------");
        scrumTeam.removeTester(1144);
        System.out.println(scrumTeam);

        scrumTeam.removeDeveloper(7733);
        System.out.println(scrumTeam);

    }
}
