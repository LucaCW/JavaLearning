package de.luca.javalearning.tests;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class Countdown {

    public static void main(String[] args) {

        final int[] countdownSeconds = {10};

        Timer timer = new Timer();
        TimerTask timerTask = new TimerTask() {
            @Override
            public void run() {
                System.out.println("Countdown: " + countdownSeconds[0]);
                countdownSeconds[0]--;

                if (countdownSeconds[0] == 0) {
                    System.exit(0);
                }
            }
        };
        timer.schedule(timerTask, 0, 1000);
    }

}
