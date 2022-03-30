package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter quantity: ");
        int number = input.nextInt();
        int count = 0;
        int n = 2;
        System.out.printf("%d first prime numbers are: ", number);
        while (count < number) {
            boolean isPrimeNumber = true;
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                count++;
                System.out.printf("%d ",n);;
            }
            n++;
        }
    }
}
