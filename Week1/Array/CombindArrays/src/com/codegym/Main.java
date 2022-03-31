package com.codegym;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static double[] createAnArray() {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter size of the array: ");
            size = input.nextInt();
            if (size < 1) {
                System.out.println("Size is not less than 1. Try again!");
                System.out.println("__________________________________");
            }
        } while (size < 1);

        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter value of element %d: ", i + 1);
            arr[i] = input.nextDouble();
        }

        return arr;
    }

    public static double[] combineArrays(double[][] array) {

        int total = 0;
        for (int i = 0; i < array.length; i++) {
            total += array[i].length;
        }

        double[] newArray = new double[total];
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newArray[k++] = array[i][j];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("How many arrays do you want to combine (please enter >1)? ");
        int quantity = input.nextInt();
        double[][] allMyArrays = new double[quantity][];

        for (int i = 0; i < quantity; i++) {
            System.out.printf("\n ----- Create Array %d ----- \n", i + 1);
            double[] getArray = createAnArray();
            allMyArrays[i] = getArray;
        }

        System.out.printf("\nAll your arrays:\n");
        for (double[] smallArray : allMyArrays) {
            System.out.println(Arrays.toString(smallArray));
        }

        String finalArray = Arrays.toString(combineArrays(allMyArrays));
        System.out.printf("\nYour NEW ARRAY after combining: %s", finalArray);

    }

}
