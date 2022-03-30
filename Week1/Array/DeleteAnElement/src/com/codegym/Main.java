package com.codegym;

import java.util.Scanner;

import java.util.Arrays;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size;
        do {
            System.out.print("Enter size of the array: ");
            size = input.nextInt();
            if (size < 1) {
                System.out.println("Size is not less than 1. Try again!");
            }
        } while (size < 1);

        double[] arr = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.printf("Enter value of element %d: ", i + 1);
            arr[i] = input.nextDouble();
        }
        System.out.println("Your entered array: " + Arrays.toString(arr));

        double number;
        int index = 0;
        boolean check = false;
        do {
            System.out.print("Enter value of an element you want to delete: ");
            number = input.nextDouble();
            for (int i = 0; i < size; i++) {
                if (number == arr[i]) {
                    index = i;
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("Can't find element, please type again!");
                System.out.println("______________________________________");
            } else {
                break;
            }
        } while (true);

        double[] newArr = new double[size - 1];
        for (int i = 0, j = 0; i < size; i++) {
            if (i == index) {
                continue;
            }
            newArr[j++] = arr[i];
        }
        System.out.println("Your new array: " + Arrays.toString(newArr));
    }
}
