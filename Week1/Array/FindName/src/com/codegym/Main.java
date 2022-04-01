package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] students = {"Christian", "Michael", "Camila", "Sienna", "Tanya", "Connor", "Zachariah", "Mallory", "Zoe", "Emily"};
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a student's name: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == input_name) {
                System.out.printf("Position of %s in the list is %d.", input_name, i + 1);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Can't find " + input_name + " in the list.");
        }
    }
}
