package de.luca.javalearning.arrays;

public class eArrays2 {

    public static void main(String[] args) {
        //Ohne bestimmte Werte
        String[] array = new String[6];

        array[0] = "Hallo";
        array[1]="du";
        array[2]="kannst";
        array[3]="nicht";
        array[4]="programmieren";
        array[5]="lol.";

        for(int i=0;i<array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }

}
