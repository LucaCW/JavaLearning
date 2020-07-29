package de.luca.javalearning.main;

import de.luca.javalearning.vererbungen.Animal;
import de.luca.javalearning.vererbungen.Dog;

public class HelloWorld {

    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = (Dog) animal;
        //Dog dog = new Dog();

        System.out.println(dog.macheDichBemerkbar()+ " " + dog.gibRasseZurück());
    }

}
