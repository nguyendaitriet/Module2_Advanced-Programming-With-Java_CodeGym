package com.codegym;

import java.util.Arrays;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        double[] myArray = random.doubles(500).toArray();;

        StopWatch myStopWatch = new StopWatch();
        myStopWatch.setStartTime();
        myStopWatch.start();
        for (int i = 0; i < myArray.length-1; i++) {
            for (int j = i+1; j < myArray.length; j++) {
                double temp;
                if (myArray[i] > myArray[j]) {
                    temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(myArray));
        myStopWatch.end();

        System.out.println("Total time (ms): " + myStopWatch.getElapsedTime());
    }
}
