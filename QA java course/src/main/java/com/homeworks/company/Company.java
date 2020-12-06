package com.homeworks.company;

import lombok.Getter;

@Getter

public class Company {

    private String name;
    private String establishmentDate;
    private String bulstat;

    public Company(String name, String establishmentDate, String bulstat) {
        this.name = name;
        this.establishmentDate = establishmentDate;
        this.bulstat = bulstat;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected void setEstablishmentDate(String establishmentDate) {
        this.establishmentDate = establishmentDate;
    }

    protected void setBulstat(String bulstat) {
        if (bulstat.length() != 10) throw new IllegalArgumentException("Bulstat should contain 10 characters");
        this.bulstat = bulstat;
    }
}
