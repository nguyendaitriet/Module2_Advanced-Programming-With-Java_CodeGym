package com.codegym;

public class Company {
    private String companyName, nation;

    public Company (String companyName, String nation) {
        this.companyName = companyName;
        this.nation = nation;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }
}
