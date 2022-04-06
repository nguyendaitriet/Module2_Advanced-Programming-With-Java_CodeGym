package com.codegym;

public abstract class Transporter {
    protected String kindOfTransporter;
    protected Company transporterCompany;
    public Transporter(String kindOfTransporter, Company transporterCompany){
        this.kindOfTransporter = kindOfTransporter;
        this.transporterCompany = transporterCompany;
    }

    public String getKindOfTransporter() {
        return kindOfTransporter;
    }

    public void setKindOfTransporter(String kindOfTransporter) {
        this.kindOfTransporter = kindOfTransporter;
    }

    public String getTransporterCompany() {
        return this.transporterCompany.getCompanyName();
    }

    public void start() {
        System.out.println("Star the engine.");
    }

    public void speedUp() {
        System.out.println("Your current speed is ...");
    }

    public void stop() {
        System.out.println("Stop");
    }

    public abstract double getVelocity();

}
