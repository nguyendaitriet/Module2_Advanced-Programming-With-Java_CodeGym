package com.codegym;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter size of matrix: ");
        int size = input.nextInt();

        //Create a matrix
        double[][] myMatrix = new double[size][size];
        System.out.printf("Enter value of %d elements in matrix: \n", size*size);
        int k = 1;
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("Value of element %d: ", k++);
                myMatrix[i][j] = input.nextDouble();
            }
        }

        //Find max value
        System.out.println("Your matrix: " + Arrays.deepToString(myMatrix));
        double max = myMatrix[0][0];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (max < myMatrix[i][j]) {
                    max = myMatrix[i][j];
                }
            }
        }
        System.out.println("Max value in your matrix: " + max);
    }
}
