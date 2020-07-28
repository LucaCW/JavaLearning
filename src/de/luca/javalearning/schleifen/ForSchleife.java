package de.luca.javalearning.schleifen;

public class ForSchleife {

    public static void main(String[] args) {

        /*int maxRunden = 10;

        for(int i=0;i<maxRunden;i++) {
            System.out.println("Runde: " + i);
        }

        System.out.println("Kampf zu Ende!");*/

        for(int i=1;i<5;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
