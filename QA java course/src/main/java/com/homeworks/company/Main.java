package com.homeworks.company;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        ET et1 = new ET("Balyk","20.04.2022","1234567890","Kancho",1234.50);
        et1.setActualCapital(51234.50);
        log.info("Actual result for \"{}\" is {}, and the tax it has to pay is {}",et1.getName(),et1.getActualResult(),et1.getTax());

        int dailyRevenue;
        try {
            dailyRevenue = et1.getDailyRevenue("360", 150700);
            log.info("Daily revenue of {} is {}", et1.getName(), dailyRevenue);
        } catch (RevenueCalculationException e) {
            log.error(e.getMessage());
        }

        dailyRevenue = et1.getDailyRevenueChecked("555",150700);
        if (dailyRevenue>=0) log.info("Daily revenue of {} is {}", et1.getName(), dailyRevenue);


    }
}
