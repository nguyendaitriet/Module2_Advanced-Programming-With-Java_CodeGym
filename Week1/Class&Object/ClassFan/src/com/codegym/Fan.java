package com.codegym;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "Blue";

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed > 0 && speed < 4) {
            this.speed = speed;
        }
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Fan() {
    }

    public String informationAboutFan() {
        if (this.on) {
            return "Your fan is ON. Speed: " + this.speed + ", color: " + this.color + " and radius: " + this.radius + ".";
        }
        return "Your fan is OFF. Color: " + this.color + " and radius: " + this.radius + ".";
    }
}
