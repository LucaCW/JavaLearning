package de.luca.javalearning.vererbungen;

public abstract class Animal implements Lebewesen{
    int beine;
    String name;
    int augen;

    public String macheDichBemerkbar() {
        return "hey";
    }

    public abstract void laufe();
}