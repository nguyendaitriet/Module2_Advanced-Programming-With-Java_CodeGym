package com.codegym;

public class Plane extends Transporter{
    private String fuel;
    public Plane(String fuel,Company transporterCompany) {
        super("Plane", transporterCompany);
        this.fuel = fuel;
    }

    @Override
    public double getVelocity() {
        return 300.8;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void takeOff() {
        System.out.println("The plane is taking off!");
    }

    public void land() {
        System.out.println("The plane is landing!");
    }
}
