package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("_____Quadratic Equation_____");
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        QuadraticEquation myEquation = new QuadraticEquation(a, b, c);
        double delta = myEquation.getDiscriminant();
        if (delta > 0) {
            System.out.println("The equation has two roots:");
            System.out.println("x1 = " + myEquation.getRoot1());
            System.out.println("x2 = " + myEquation.getRoot2());
        } else if (delta == 0) {
            System.out.println("The equation has one root:");
            System.out.println("x1 = x2 = " + myEquation.getRoot1());

        } else {
            System.out.println("The equation has no real root.");
        }
    }
}
