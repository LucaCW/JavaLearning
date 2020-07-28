package de.luca.javalearning.operators;

public class Operators4 {

    public static void main(String[] args) {
        //Logische Operatoren
        boolean lernen = true;
        boolean chillen = true;
        boolean guteNoten;

        guteNoten = lernen && chillen;

        System.out.println(guteNoten);

        guteNoten = lernen ^ chillen;

        System.out.println(guteNoten);

        guteNoten = lernen || chillen;

        System.out.println(guteNoten);
    }

}
