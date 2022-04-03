package com.codegym;

public class Author {
    private String fullName;
    private Date dayOfBirth;

    public Author(String fullName, Date dayOfBirth) {
        this.fullName = fullName;
        this.dayOfBirth = dayOfBirth;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getDayOfBirth() {
        return this.dayOfBirth;
    }

    public void setDayOfBirth(Date dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }
}
