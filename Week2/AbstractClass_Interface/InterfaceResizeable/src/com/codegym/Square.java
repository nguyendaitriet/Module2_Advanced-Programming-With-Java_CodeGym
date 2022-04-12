package com.codegym;

public class Square extends Rectangle implements Colorable{

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    @Override
    public void howToColor() {
        System.out.println("Color all sides");
    }
}
