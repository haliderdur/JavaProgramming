package day32_ConstructorOverloading.day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogObjects {
    public static void main(String[] args) {

        Dog dog1 = new Dog();
        dog1.name = "Lucy";
        dog1.breed = "Husky";
        dog1.age = 2;
        dog1.gender = 'F';
        dog1.color = "White";
        dog1.size = "Medium";

        Dog dog2 = new Dog();
        dog2.name = "Tofu";
        dog2.breed = "Maltese";
        dog2.age = 3;
        dog2.gender = 'M';
        dog2.color = "Black & White";
        dog2.size = "Small";

        Dog dog3 = new Dog();
        dog3.setInfo("Jackie", "German Shepard", "Large", "Black", 2, 'M');

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog3);

        dog1.bark();
        dog2.eat();
        dog3.play();

        Dog dog4 = new Dog();
        dog4.setInfo("Koko", "Doberman", "Large", "Black", 3, 'M');

        Dog dog5 = new Dog();
        dog5.setInfo("Pippa", "Golden Retriever", "Large", "Brown", 1, 'F');

        System.out.println("------------------------------------------------------------------------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4, dog5};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        femaleDogs.addAll(Arrays.asList(dogs));
        femaleDogs.removeIf(p -> p.gender == 'M');

        ArrayList<Dog> maleDogs = new ArrayList<>();
        maleDogs.addAll(Arrays.asList(dogs));
        maleDogs.removeIf(p -> p.gender == 'F');

        System.out.println("femaleDogs = " + femaleDogs);
        System.out.println("femaleDogs size = " + femaleDogs.size());
        System.out.println("maleDogs = " + maleDogs);
        System.out.println("maleDogs size = " + maleDogs.size());
    }
}
