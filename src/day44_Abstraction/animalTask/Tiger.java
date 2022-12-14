package day44_Abstraction.animalTask;

public final class Tiger extends Animal implements WildAnimal {

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

    @Override
    public void hunt() {
        System.out.println(getName() + " is hunting deer");
    }
}
