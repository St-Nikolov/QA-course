package com.javalectures.lecture12;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {

    public static void main(String[] args) {
       String[] characters = new String[]{PasswordGenerator.CAPITAL_LETTERS,PasswordGenerator.SMALL_LETTERS,PasswordGenerator.DIGITS,PasswordGenerator.SPECIAL_CHARACTERS,"ЯВЕРТЪУИИОПЛЙКГХФГХСДАСЗѝЦЦЖЖБНМ"};
       for (int i=0;i<5;i++) {
           log.info("Pass example  {} \n", PasswordGenerator.generatePassword(6,16,characters));
       }
    }
}
