package de.luca.javalearning.arrays;

public class zdarrays {

    public static void main(String[] args) {
            String [] [] zweiD = {
                    {"Das", "ist", "geilo"},
                    {"mit", "diesen", "komischen"},
                    {"autistischen", "coolen", "arrays"}
            };

            for(int i=0;i<zweiD.length;i++) {
                for(int j=0;j<zweiD[i].length;j++) {
                    System.out.print(zweiD[i][j] + " ");
                }
            }
    }

}
