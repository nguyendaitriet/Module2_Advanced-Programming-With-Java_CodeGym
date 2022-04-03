package com.codegym;

import java.util.Scanner;

import java.util.Arrays;

public class Main {

    public static double[] createAnArray() {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter size of the array: ");
            size = input.nextInt();
            if (size < 1) {
                System.out.println("Size is not less than 1. Try again!");
                System.out.println("___________________________________");
            }
        } while (size < 1);

        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter value of element %d: ", i + 1);
            arr[i] = input.nextDouble();
        }
        System.out.println("Your entered array: " + Arrays.toString(arr));

        return arr;
    }

    public static double[] addElementToArray(double value, int index, double[] array) {
        double[] newArray = new double[array.length + 1];
        for (int i = 0; i < newArray.length; i++) {
            if (i < index) {
                newArray[i] = array[i];
            } else if (i == index) {
                newArray[i] = value;
            } else {
                newArray[i] = array[i - 1];
            }
        }
        return newArray;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double[] myArray = createAnArray();
        ;
        int size = myArray.length;

        double value;
        int position;
        System.out.print("Enter value of an element you want to add: ");
        value = input.nextDouble();
        do {
            System.out.print("Enter position you want to add (start at 0): ");
            position = input.nextInt();
            if (position < 0 || position >= size) {
                System.out.println("Your position doesn't exist, please enter again!");
                System.out.println("________________________________________________");
                continue;
            }
            break;
        } while (true);

        System.out.println("--> Your new array after adding: " + Arrays.toString(addElementToArray(value, position, myArray)));
    }
}
