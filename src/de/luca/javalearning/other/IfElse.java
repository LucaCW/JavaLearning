package de.luca.javalearning.other;

public class IfElse {

    public static void main(String[] args) {
        int temperatur;

        temperatur = 6;

        /*if(temperatur < 7) {
            System.out.println("Jo ich trinke ein Bier.");
        } else if(temperatur == 7){
            System.out.println("Perfekt! Gib mir eins.");
        } else {
            System.out.println("Neee ich will nen kaltes Bier!");
        }*/

        switch (temperatur) {

            case 1:
                System.out.println("Ist schon okay! Nehm ich mir.");
                break;
            case 7:
                System.out.println("Optimal gönn ich mir!");
                break;
            default:
                System.out.println("NAH das Bier mag ich nicht.");
                break;
        }
    }

}
