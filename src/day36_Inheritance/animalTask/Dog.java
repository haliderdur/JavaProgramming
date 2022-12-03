package day36_Inheritance.animalTask;

public class Dog extends Animals { // Dog is an animal
    //      Child        Parent

    public void bark() {
        System.out.println(name + " is barking");
    }

}
/*
    dog:
        6 variables from Animals parent class
        6 methods from Animals parent class
        1 method from Dog child class
 */