package day35_Encapsulation.encapsulation;

public class PersonObjects {

    public static void main(String[] args) {

        Person person1 = new Person();

        // person1.name = "Halid";
        // person1.age = 33; 

        person1.setName("Daniel");
        person1.setAge(33);

        // System.out.println(person1.name + " : " + person1.age);
        System.out.println(person1.getName() + " : " + person1.getAge());


    }
}
