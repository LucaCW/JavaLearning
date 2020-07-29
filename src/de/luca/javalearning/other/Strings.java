package de.luca.javalearning.other;

public class Strings {

    public static void main(String[] args) {
        char [] a = {'c', 'o', 'o', 'l'};
        String b = new String(a);

        String besser = "cool";

        System.out.println(b);
        System.out.println(besser);

        String d = "Das ";
        String e = "ist ";
        String f = "cool.";
        String def = d+e+f;

        int laenge = def.length();

        System.out.println(def);
        System.out.println("Laenge: " + laenge);
    }

}
