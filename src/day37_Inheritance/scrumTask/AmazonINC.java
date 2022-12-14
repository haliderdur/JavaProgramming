package day37_Inheritance.scrumTask;

public class AmazonINC {
    public static void main(String[] args) {

        String company = "Amazon INC";

        ProductOwner PO = new ProductOwner("Jack", 35, 'M', 8877, 160000, company);

        BusinessAnalyst BA = new BusinessAnalyst("Marta", 30, 'F', 6633, 135000, company);

        ScrumMaster SM = new ScrumMaster("Angel", 28, 'M', 2626, 125000, company);

        Tester tester1 = new Tester("Halid", 33, 'M', "SDET", 2233, 125000, company);
        Tester tester2 = new Tester("Sarah", 31, 'F', "QA", 1223, 115000, company);
        Tester tester3 = new Tester("Catia", 29, 'F', "QE", 1122, 125000, company);
        Tester tester4 = new Tester("Alexey", 35, 'M', "QA", 6611, 120000, company);
        Tester[] testers = {tester1, tester2, tester3, tester4};

        Developer developer1 = new Developer("Daniela", 28, 'F', "Java Developer", 2992, 140000, company);
        Developer developer2 = new Developer("John", 35, 'M', "Java Developer", 6688, 150000, company);
        Developer developer3 = new Developer("Mehmet", 35, 'M', "Java Developer", 2699, 130000, company);
        Developer developer4 = new Developer("Brian", 27, 'M', "Web Developer", 4555, 130000, company);
        Developer developer5 = new Developer("Ivan", 29, 'M', "Mobile Developer", 1278, 132000, company);

        Developer[] developers = {developer1, developer2, developer3, developer4, developer5};


        ScrumTeam scrumTeam = new ScrumTeam(PO, BA, SM);
        System.out.println(scrumTeam);

        scrumTeam.addDevelopers(developers);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("----------------------------------------------------------------------------");

        for (Tester eachTester : scrumTeam.testers) {
            System.out.println(eachTester.getJobTitle() + " " + eachTester.getName() + ": " + eachTester.getSalary());
        }

        System.out.println();

        for (Developer eachDeveloper : scrumTeam.developers) {
            System.out.println(eachDeveloper.getJobTitle() + " " + eachDeveloper.getName() + ": " + eachDeveloper.getSalary());
        }

    }
}
