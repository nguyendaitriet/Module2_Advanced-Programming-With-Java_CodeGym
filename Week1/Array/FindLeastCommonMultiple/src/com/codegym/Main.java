package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("a = ");
        int a = input.nextInt();
        System.out.print("b = ");
        int b = input.nextInt();
        System.out.print("c = ");
        int c = input.nextInt();
        int i = 1;
        boolean check = i % a == 0 && i % b == 0 && i % c == 0;
        System.out.println(check);
//        while (check) {
//            if (i)
//        }

    }
}
