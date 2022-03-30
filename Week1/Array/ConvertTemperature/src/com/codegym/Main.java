package com.codegym;

import java.util.Scanner;

public class Main {

    public static double toCelsius (double fahrenheit) {
        return  (fahrenheit - 32) * 5 / 9;
    }

    public static double toFahrenheit (double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.println("Temperature conversion (choose an action): ");
            System.out.println("1. Convert Fahrenheit to Celsius.");
            System.out.println("2. Convert Celsius to Fahrenheit.");
            System.out.println("0. Exit.");
            System.out.print("Your choice is: ");
            choice = input.nextInt();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    System.out.print("Enter Celsius: ");
                    double celsius1 = input.nextDouble();
                    double fahrenheit1 = toFahrenheit(celsius1);
                    System.out.printf("Result: %.2f oC = %.2f oF \n", celsius1, fahrenheit1);
                    System.out.println("-----------------------------");
                    break;
                case 2:
                    System.out.print("Enter Celsius: ");
                    double fahrenheit2 = input.nextDouble();
                    double celsius2 = toCelsius(fahrenheit2);
                    System.out.printf("Result: %.2f oF = %.2f oC \n", fahrenheit2, celsius2);
                    System.out.println("-----------------------------");
                    break;
                default:
                    System.out.println("No choice. Enter again!");
                    System.out.println("-----------------------------");
            }
        } while (choice != 0);
    }
}
