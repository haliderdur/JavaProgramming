package day44_Abstraction.animalTask;

public class Parrot extends Animal {

    public Parrot(String name, int age, String size, String breed, char gender, String color) {
        super(name, age, size, breed, gender, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating chocolate");
    }
}
