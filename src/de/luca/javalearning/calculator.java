package de.luca.javalearning;

import java.util.Scanner;

/**
 * Dieses Programm kann bisher nur 2 Zahlen zusammenrechnen.
 * @author Luca R.
 */

public class calculator {

    public static void main(String[] args) {
        //Deklarieren der Variablen
        int zahl1;
        int zahl2;
        int ergebnis;

        //Erstellen des Scanners für Eingaben in der Console
        @SuppressWarnings("resource")
        Scanner eingabewert = new Scanner(System.in);

        /*
        Es werden zunächst die zwei eingegebenen Zahlen bestimmt.
        Danach werden diese zusammengerechnet und das Ergebnis ausgegeben.
         */
        System.out.println("1. Zahl:");
        zahl1 = eingabewert.nextInt();

        System.out.println("2. Zahl:");
        zahl2 = eingabewert.nextInt();

        ergebnis = zahl1 + zahl2;
        System.out.println("Ergebnis: " + ergebnis);

    }

}
