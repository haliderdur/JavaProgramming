package day37_Inheritance.animalTask;

public class Bird extends Animal {

    public String birdWingColor;

    public Bird(String name, String breed, char gender, int age, String size, String color, String birdWingColor) {
        super(name, breed, gender, age, size, color);
        this.birdWingColor = birdWingColor;
    }


    public void fly() {
        System.out.println(name + " is flying");
    }
}
