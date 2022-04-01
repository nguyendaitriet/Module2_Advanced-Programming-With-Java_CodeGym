package com.codegym;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width: ");
        double width = scanner.nextDouble();
        System.out.print("Enter the height: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n"+ rectangle.display());
        System.out.printf("Perimeter of the Rectangle: %.2f\n", rectangle.getPerimeter());
        System.out.printf("Area of the Rectangle: %.2f\n", rectangle.getArea());
    }
}
