package services;

import util.InputUtil;
import util.Util;

import java.sql.Time;
import java.time.LocalTime;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GameServiceİmple implements services.imple.GameService {
    double correctWords = 0;
    double wps = 0;
    double wpm = 0;


    public void play() throws InterruptedException {

        Util.writeWordsToDinamicArray();

        System.out.println();

        for (int i = 3; i >= 0; i--) {
            System.out.print("\rGame start in " + i + " seconds..");
            Thread.sleep(1000);
            if (i == 0) {
                System.out.println("Start!");
            }
        }

        long start = System.currentTimeMillis();
        long end = start + 60000;
        while (System.currentTimeMillis() < end){
            String randomWords = Util.getRandomWord();
            System.out.println(randomWords);
            String clientWord = InputUtil.requiredInputStr("");
            if (randomWords.equalsIgnoreCase(clientWord)){
                correctWords++;
            }
        }
        wpm = correctWords;
        wps = correctWords / (((double) start / 1000)) ;

        double score = wps;
        double socrewpm = wpm;


        System.out.println("WPM: " + wpm + "\n" +
                           "WPS: " + wps);
    }


    @Override
    public void exit() {
        System.exit(-1);

    }
}
