package com.codegym;

public class Bike extends Transporter{
    public Bike(Company transporterCompany) {
        super("Bike", transporterCompany);
    }

    @Override
    public double getVelocity() {
        return 15.3;
    }
}
