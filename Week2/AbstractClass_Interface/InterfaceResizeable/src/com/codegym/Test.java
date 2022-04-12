package com.codegym;

public class Test {
    public static void main(String[] args) {
        Shape[] allShape = new Shape[2];
        allShape[0] = new Circle(2);
        allShape[1] = new Rectangle(3, 2);

        System.out.println(((Rectangle) allShape[1]).getArea());
        System.out.println(((Circle) allShape[0]).getArea());


        System.out.println(((Rectangle) allShape[1]).resize(12));
        System.out.println(((Circle) allShape[0]).resize(33));
    }
}


