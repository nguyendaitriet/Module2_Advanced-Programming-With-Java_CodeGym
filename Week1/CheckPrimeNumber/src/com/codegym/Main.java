package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a POSITIVE integer: ");
        long number = input.nextLong();
        boolean isPrimeNumber = true;
        if (number == 0 || number == 1) {
            isPrimeNumber = false;
        } else {
            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
        }
        if (isPrimeNumber) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
