package day44_Abstraction.animalTask;

public class Parrot extends Animal {

    public Parrot(String name, int age, String size, String breed, char gender, String color) {
        super(name, age, size, breed, gender, color);
    }

    public void repeat() {
        System.out.println(getName() + " is repeating what people say");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating chocolate");
    }
}
