package day36_Inheritance.animalTask;

public class Cat extends Animals { // Cat is an animal
    //       Child        Parent

    public void meow() {
        System.out.println(name + " is meowing");
    }

    public void scratch() {
        System.out.println(name + " is scratching");
    }
}
/*
    cat:
        6 variables from Animals parent class
        6 methods from Animals parent class
        2 methods from Cat child class
 */
