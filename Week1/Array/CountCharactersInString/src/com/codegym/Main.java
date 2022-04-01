package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String myString = input.nextLine();
        System.out.print("Enter a character you want to find: ");
        char myChar = input.next().charAt(0);

        int count = 0;
        for (int i = 0; i < myString.length(); i++) {
            if (myChar == myString.charAt(i)) {
                count++;
            }
        }
        if (count == 0) {
            System.out.printf("Can't find '%s' in your string!", myChar);
        } else {
            System.out.printf("There %s %d character '%s' in your string.", count == 1 ? "is" : "are", count, myChar);
        }
    }
}
