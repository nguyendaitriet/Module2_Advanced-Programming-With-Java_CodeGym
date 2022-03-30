package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int choice = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 0) {
            System.out.println("What shape would you like to draw?");
            System.out.println("1. Draw a rectangle.");
            System.out.println("2. Draw an isosceles right triangle.");
            System.out.println("3. Draw a isosceles triangle.");
            System.out.println("0. Exit.");
            System.out.print("Your choice is: ");
            choice = input.nextInt();

            switch (choice) {
                case 2: {
                    System.out.print("Enter size (>1): ");
                    int size = input.nextInt();
                    for (int i = 1; i <= size; i++) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                    System.out.println("");

                    for (int i = size; i >0; i--) {
                        for (int j = 1; j <= i; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }

                    System.out.println("");
                    for (int i = 1; i <= size; i++) {
                        for (int j = 1; j <= size; j++) {
                            if (j >= i) {
                                System.out.print("*  ");
                            } else {
                                System.out.print("   ");
                            }
                        }
                        System.out.println("");
                    }
                    System.out.println("");

// Uncompleted
//                    for (int i = 1; i <= size; i++) {
//                        for (int j = 1; j <= size; j++) {
//                            if (i <= j) {
//                                System.out.print("   ");
//                            } else {
//                                System.out.print("*  ");
//                            }
//                        }
//                        System.out.println("");
//                    }
//                    System.out.println("");
                }
                break;

                case 3: {
                    System.out.print("Enter size (>1): ");
                    int size = input.nextInt();
                    for (int i = size; i > 0; i--) {
                        for (int j = 1; j <= size; j++) {
                            if (j >= i) {
                                System.out.print("*   ");
                            } else {
                                System.out.print("  ");
                            }
                        }
                        System.out.println("");
                    }
                }
                break;

                case 1: {
                    System.out.print("Enter width (>1): ");
                    int width = input.nextInt();
                    System.out.print("Enter height (>1): ");
                    int height = input.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("*  ");
                        }
                        System.out.println("");
                    }
                }
                break;

                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}