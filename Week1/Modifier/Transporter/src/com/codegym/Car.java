package com.codegym;

public class Car extends Transporter{
    private String fuel;
    public Car(String fuel, Company transporterCompany) {
        super("Car", transporterCompany);
        this.fuel = fuel;
    }

    @Override
    public double getVelocity() {
        return 80.5;
    }

    public String getFuel() {
        return this.fuel;
    }
    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
