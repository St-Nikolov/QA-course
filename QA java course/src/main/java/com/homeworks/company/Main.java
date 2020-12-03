package com.homeworks.company;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        ET et1 = new ET("Balyk","20.04.2022","1234567890","Kancho",1234.50);
        et1.setActualCapital(51234.50);
        log.info("Actual result for \"{}\" is {}, and the tax it has to pay is {}",et1.getName(),et1.getActualResult(),et1.getTax());
    }
}
