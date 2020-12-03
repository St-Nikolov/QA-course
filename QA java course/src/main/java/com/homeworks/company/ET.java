package com.homeworks.company;

import lombok.Getter;

@Getter
public class ET extends Company implements TaxPayer{

    private String nameOfTheOwner;
    private double initialCapital;
    private double actualCapital;

    public ET(String name, String establishmentDate, String bulstat) {
        super(name, establishmentDate, bulstat);
    }

    public ET(String name, String establishmentDate, String bulstat, String nameOfTheOwner,Double initialCapital){
        super(name, establishmentDate, bulstat);
        this.nameOfTheOwner = nameOfTheOwner;
        this.initialCapital = initialCapital;
    }

    @Override
    public double getTax() {
        return getActualResult()*0.10;
    }

        public double getActualResult(){
        return getActualCapital() - getInitialCapital();
    }

    protected void setNameOfTheOwner(String nameOfTheOwner) {
        this.nameOfTheOwner = nameOfTheOwner;
    }

    protected void setInitialCapital(double initialCapital) {
        this.initialCapital = initialCapital;
    }

    protected void setActualCapital(double actualCapital) {
        this.actualCapital = actualCapital;
    }
}
