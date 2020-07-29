package de.luca.javalearning.vererbungen;

public class Animal implements Lebewesen{
    int beine;
    String name;
    int augen;

    public String macheDichBemerkbar() {
        return "hey";
    }

    @Override
    public void atme() {
        System.out.println("Schnauf");
    }
}