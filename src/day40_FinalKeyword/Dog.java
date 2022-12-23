package day40_FinalKeyword;

public final class Dog extends Animal {

    public Dog(String name, int age, String size, String breed, char gender, String color) {
        super(name, age, size, breed, gender, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating dog food");
    }

    /*
        final methods can not be overridden

    public final void drink() {
        System.out.println(getName() + " is drinking beer");
    }
     */


}
