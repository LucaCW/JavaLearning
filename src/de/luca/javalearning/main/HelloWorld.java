package de.luca.javalearning.main;

import de.luca.javalearning.vererbungen.Animal;
import de.luca.javalearning.vererbungen.Dog;
import de.luca.javalearning.vererbungen.Fish;
import de.luca.javalearning.vererbungen.Lebewesen;

public class HelloWorld {

    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        //Dog dog = new Dog();

        System.out.println(dog.macheDichBemerkbar()+ " " + dog.gibRasseZurück());
        animal.atme();
        dog.atme();

        Lebewesen lebewesen = new Fish();
        lebewesen.atme();

        Lebewesen[] ls = new Lebewesen[10];

        for(int i=0; i < 10; i++) {
            ls[i] = new Fish();
        }

        ls[5] = new Dog();
        ls[4] = new Animal();

        for(int i=0; i < 10; i++) {
            ls[i].atme();
        }
    }

}
