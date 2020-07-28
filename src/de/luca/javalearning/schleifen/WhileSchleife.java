package de.luca.javalearning.schleifen;

public class WhileSchleife {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;

        //Abweisende Schleife
        while (a>b) {

            System.out.println("Countdown: " + a);
            a--;
        }

        System.out.println("wuhuuuu :3");

        //Annehmende Schleife
        do {
            System.out.println("Countdown: " + a);
            a--;
        } while (a>b);

        System.out.println("wuhuuuu :3");
    }

}
