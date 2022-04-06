package com.codegym;

public class Test {

    public static void main(String[] args) {
        Company company1 = new Company("International", "Japan");
        Company company2 = new Company("Rolex", "Laos");
        Company company3 = new Company("Button", "China");

        Transporter kind1 = new Plane("Diesel",company1);
        Transporter kind2 = new Car("gasoline",company2);
        Transporter kind3 = new Bike(company3);

        System.out.println(kind1.getTransporterCompany());
        System.out.println(kind2.getTransporterCompany());
        System.out.println(kind3.getTransporterCompany());

        System.out.println(kind1.getVelocity());
        kind1.start();
        kind1.speedUp();

    }
}
