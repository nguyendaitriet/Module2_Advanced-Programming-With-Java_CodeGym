package com.codegym;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter mark quantity: ");
        int quantity = input.nextInt();

        System.out.println("Enter value of each mark: ");
        double[] markArray = new double[quantity];
        for (int i = 0; i < quantity; i++) {
            markArray[i] = Math.abs(input.nextDouble());
        }

        System.out.println(Arrays.toString(markArray));
    }
}
