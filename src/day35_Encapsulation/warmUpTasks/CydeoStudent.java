package day35_Encapsulation.warmUpTasks;

/*
create a class named CydeoStudent
    Variables: name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode
    Add a constructor to initialize all the fields
    Add a static block to initialize all the statics
    methods:
        printSchoolName();
        printSecretCode();
        attendClass():
        study()
        toString()
 */
public class CydeoStudent {
    public String name;
    public char gender;
    public int age;
    public long batchNumber;
    public int groupNumber;
    public static String schoolName;
    public String fieldOfStudy;
    public static String programmingLanguage;
    public static String secretCode;

    public CydeoStudent(String name, char gender, int age, long batchNumber, int groupNumber, String fieldOfStudy) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.batchNumber = batchNumber;
        this.groupNumber = groupNumber;
        this.fieldOfStudy = fieldOfStudy;
    }

    static {
        schoolName = "Cydeo";
        programmingLanguage = "Java";
        secretCode = "Wooden Sppon";
    }

    public static void printSchoolName() {
        System.out.println("schoolName = " + schoolName);
    }

    public void printSecretCode() {
        System.out.println("secretCode = " + secretCode);
    }

    public void attendClass() {
        System.out.println(name + " is attending " + fieldOfStudy + " classes");
    }

    public void study() {
        System.out.println(name + " is studying" + programmingLanguage);
    }

    public String toString() {
        return "CydeoStudent{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", batchNumber=" + batchNumber +
                ", groupNumber=" + groupNumber +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", secretCode='" + secretCode + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", secretCode='" + secretCode + '\'' +
                '}';
    }

}
