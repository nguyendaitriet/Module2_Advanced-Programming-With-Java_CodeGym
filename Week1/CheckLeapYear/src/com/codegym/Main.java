package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        boolean isLeapYear = false;

        boolean isYearDivisibleBy4 = year % 4 == 0;
        if (isYearDivisibleBy4) {
            boolean isYearDivisibleBy100 = year % 100 == 0;
            if (isYearDivisibleBy100) {
                boolean isYearDivisibleBy400 = year % 400 == 0;
                if (isYearDivisibleBy400) {
                    isLeapYear = true;
                }
            } else {
                isLeapYear = true;
            }
        }

        if (isLeapYear) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
}
