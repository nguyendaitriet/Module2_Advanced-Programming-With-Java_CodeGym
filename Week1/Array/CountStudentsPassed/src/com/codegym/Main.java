package com.codegym;


import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter student quantity: ");
        int quantity = input.nextInt();

        System.out.println("Enter one by one student's mark: ");
        double[] markArray = new double[quantity];
        int count = 0;
        for (int i = 0; i < quantity; i++) {
            do {
                markArray[i] = input.nextDouble();
                if (markArray[i] < 0 || markArray[i] > 10) {
                    System.out.println("Invalid mark, please enter again!");
                } else {
                    break;
                }
            } while (true);
            if (markArray[i] >= 5) {
                count++;
            }
        }

        System.out.printf("Your entered mark: %s \n", Arrays.toString(markArray));
        if (count == 0) {
            System.out.println("There is no student passed the test.");
        } else {
            System.out.printf("There %s %d %s passed the test.", count == 1 ? "is only" : "are", count, count == 1 ? "student" : "students");
        }
    }
}
