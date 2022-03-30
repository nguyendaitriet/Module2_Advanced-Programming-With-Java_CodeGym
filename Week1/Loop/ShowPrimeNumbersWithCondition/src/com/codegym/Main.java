package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter max value: ");
        int max = input.nextInt();
        System.out.printf("The prime numbers <%d are: ", max);
        for (int i = 2; i < max; i++) {
            boolean isPrimeNumber = true;
            for (int k = 2; k <i; k++) {
                if (i % k == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                System.out.printf("%d ", i);
            }
        }

    }
}
