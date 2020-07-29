package de.luca.javalearning.other;

public class Datentypen {

    public static void main(String[] args) {
        String name;

        byte alter;

        short groeße;

        int einkommen;

        double gewicht;

        char geschlecht;

        boolean istcool;

        name = "Jan";
        alter = 22;
        groeße = 185;
        einkommen = 20000;
        gewicht = 85.5;
        geschlecht = 'm';
        istcool = true;

        System.out.println("Steckbrief von " + name);
        System.out.println("Alter: " + alter);
        System.out.println("Groeße: " + groeße);
        System.out.println("Einkommen: " + einkommen);
        System.out.println("Gewicht: " + gewicht);
        System.out.println("Geschlecht: " + geschlecht);
        System.out.println("Coole Sau? " + istcool);
    }

}
