package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Find the greatest common divisor (GCD) of a and b.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = input.nextInt();
        System.out.print("Enter b: ");
        int b = input.nextInt();
        int a1 = Math.abs(a);
        int b1 = Math.abs(b);
        if (a == 0) {
            if (b == 0) {
                System.out.println("No greatest common divisor found.");
            } else {
                System.out.printf("GCD(%d, %d) is %d.", a, b, b1);
            }
        } else if (b == 0) {
            System.out.printf("GCD(%d, %d) is %d.", a, b, a1);
        } else {
            while (a1 != b1) {
                if (a1 > b1) {
                    a1 = a1 - b1;
                } else {
                    b1 = b1 - a1;
                }
            }
            System.out.printf("GCD(%d, %d) is %d.", a, b, a1);
        }
    }
}


