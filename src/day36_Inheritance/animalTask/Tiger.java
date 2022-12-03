package day36_Inheritance.animalTask;

public class Tiger extends Animals { // Tiger is an animal
    //       Child         Parent

    public void roar() {
        System.out.println(name + " is roaring");
    }

    public void hunt() {
        System.out.println(name + " is hunting");
    }
}
/*
    tiger:
        6 variables from Animals parent class
        6 methods from Animals parent class
        2 methods from Tiger child class
 */
