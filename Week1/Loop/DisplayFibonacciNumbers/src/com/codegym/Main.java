package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("How many Fibonacci numbers do you want me to show? ");
        int quantity = input.nextInt();
        System.out.println("Result:");
        int fib = 1, x1 = 0, x2 = 1;
        for (int i = 0; i < quantity; i++) {
            System.out.printf("%d  ",fib);
            fib = x1 + x2;
            x1 = x2;
            x2 = fib;
        }
    }
}
