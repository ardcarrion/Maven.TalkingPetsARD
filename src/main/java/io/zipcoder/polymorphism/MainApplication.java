package io.zipcoder.polymorphism;

import io.zipcoder.pets.Bird;
import io.zipcoder.pets.Cat;
import io.zipcoder.pets.Dog;
import io.zipcoder.pets.Pet;

/**
 * Created by leon on 11/6/17.
 */
public class MainApplication {

    public static Pet createPet(String type, String name) {
        if (type.equalsIgnoreCase("cat")) {
            Cat cat = new Cat(name);
            return cat;
        } else if (type.equalsIgnoreCase("dog")) {
            Dog dog = new Dog(name);
            return dog;
        } else if (type.equalsIgnoreCase("bird")) {
            Bird bird = new Bird(name);
            return bird;
        }
        return null;
    }

}
