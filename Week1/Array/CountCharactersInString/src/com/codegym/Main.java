package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String myString = input.nextLine();
        System.out.print("Enter a character you want to find: ");
        String myChar = input.nextLine();

        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myChar.equals(myString.charAt(i))) {
                count++;
            }
        }
        if (count == 0) {
            System.out.printf("Can't find '%s' in your string!", myChar);
        }
    }
}
