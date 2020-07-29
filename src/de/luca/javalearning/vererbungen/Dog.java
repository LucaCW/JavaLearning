package de.luca.javalearning.vererbungen;

public class Dog extends Animal {
    String rasse = "dalmatiner";

    public String gibRasseZurück() {
        return rasse;
    }

    public String macheDichBemerkbar() {
        return "WUFF";
    }

    @Override
    public void laufe() {
        System.out.println("hüpf");
    }

    public void atme() {
        System.out.println("Hechel");
    }
}
