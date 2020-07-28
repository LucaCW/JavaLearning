package de.luca.javalearning.arrays;

public class eArrays {

    public static void main(String[] args) {

        int[] schrank = {1,2,3,4,5,6};

        System.out.println("Wert an Position 1: " + schrank[0]);

        int laenge = schrank.length;
        System.out.println("Länge des Arrays: " + laenge);

        System.out.println("Wert an Postion 4: " + schrank[3]);

        schrank[3] = 10;

        System.out.println("Wert an Postion 4: " + schrank[3]);
    }

}
