package com.homeworks.company;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.codehaus.plexus.util.StringUtils;

@Getter
@Slf4j
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

    public int getDailyRevenue(String calculationPeriodInDays, int revenueForPeriod) throws RevenueCalculationException{
        try {
            return revenueForPeriod/Integer.parseInt(calculationPeriodInDays);
        } catch (NumberFormatException e) {
            throw new RevenueCalculationException("Period parameter should contain only digits");
        } catch (ArithmeticException e) {
            throw new RevenueCalculationException("Period parameter cannot be zero",e);
        }

    }

    public int getDailyRevenueChecked(String calculationPeriodInDays, int revenueForPeriod) {
        if (!isNumber(calculationPeriodInDays)) {
            log.error("Period parameter should contain only digits");
            return -1;
        }
        int days = Integer.parseInt(calculationPeriodInDays);
        if (days==0) {
            log.error("Period parameter cannot be zero");
            return -2;
        }
        return revenueForPeriod/days;
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

    private boolean isNumber(String number){
//        return number.matches("[0-9] + ([0-9]+)?");
//       return StringUtils.isNumeric(number);

       return number.matches("\\d+(\\d+)?");
    }
}
