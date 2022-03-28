package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int rate = 23000;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter USD: ");
        double usd = input.nextDouble();
        int vnd  = (int) usd * 23000;
        System.out.println(usd + " USD = " + vnd + " VND");
    }
}
