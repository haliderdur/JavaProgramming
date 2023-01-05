package day44_Abstraction.animalTask;

public class Tiger extends Animal {

    public Tiger(String name, int age, String size, String breed, char gender, String color) {
        super(name, age, size, breed, gender, color);
    }

    public void roar() {
        System.out.println(getName() + " is roaring");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating deer");
    }
}
