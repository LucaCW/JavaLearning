package de.luca.javalearning.vererbungen;

public class Dog extends Animal {
    String rasse = "dalmatiner";

    public String gibRasseZurück() {
        return rasse;
    }

    public String macheDichBemerkbar() {
        return "WUFF";
    }

    public void atme() {
        System.out.println("Hechel");
    }
}
