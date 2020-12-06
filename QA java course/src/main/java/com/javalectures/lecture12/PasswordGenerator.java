package com.javalectures.lecture12;

import lombok.extern.slf4j.Slf4j;

import java.util.Random;

@Slf4j
public class PasswordGenerator {

    static final String CAPITAL_LETTERS = "QWERTYUIOPASDFGHJKLZXCVBNM";
    static final String SMALL_LETTERS = "qwertyuiopasdfghjklzxcvbnm";
    static final String DIGITS = "0123456789";
    static final String SPECIAL_CHARACTERS = "!@#$%^&*()-=_+[]{};'\\:\"|,./<>?|~";

    private static Random random = new Random();


    /* Generates random password. The password contains at least 1 character from every element of characters array.
    minLength - Minimum length for the pass. Minimum length must be equal or bigger than size of characters array.
    maxLength - Maximum length for the pass
    characters - Array of String, every element contains set of characters, like small letters or capital letters, so the pass will use at least one character from every String.
     */
    public static String generatePassword(int minLength, int maxLength,String[] characters){
        if (minLength>maxLength || minLength < characters.length) {
            log.error("The minimum length should be less than or equal the maximum length and number of character strings.");
            return "";
        }

        char character;
        String allCharacters = "";

        int passLength = random.nextInt(maxLength - minLength + 1) + minLength;
        StringBuilder password = new StringBuilder(passLength);

        String setOfTheFirstCharacter = setFirstCharacter(password,characters);


        for (String setOfCharacters:characters
             ) {
            if (setOfCharacters!=setOfTheFirstCharacter) {
                character = getRandomChar(setOfCharacters);
                password.insert(random.nextInt(password.length()) + 1, character);
            }
            allCharacters = allCharacters.concat(setOfCharacters);
        }

        for (int i=1; i <= (passLength-characters.length); i++){
            character = getRandomChar(allCharacters);
            password.insert(random.nextInt(password.length()) + 1,character);
        }
        return password.toString();
    }

    private static char getRandomChar(String characters){
        return characters.charAt(random.nextInt(characters.length()));
    }

    private static String setFirstCharacter(StringBuilder password,String[] characters){
        String firstCharacterSet = "";
        boolean isFirstCharacterSetted = false;
        char character;

        for (String setOfCharacters:characters
        ) {
            if (setOfCharacters==CAPITAL_LETTERS || setOfCharacters==SMALL_LETTERS) {
                character = getRandomChar(setOfCharacters);
                if (!isFirstCharacterSetted) {
                    password.insert(0, character);
                    firstCharacterSet = setOfCharacters;
                    isFirstCharacterSetted=true;
                } else if (random.nextBoolean()) {
                        password.insert(0, character);
                        firstCharacterSet = setOfCharacters;
                }
            }
        }

        if (firstCharacterSet == "") {
            firstCharacterSet = characters[random.nextInt(characters.length)];
            password.insert(0,getRandomChar(firstCharacterSet));
        }
        return firstCharacterSet;
    }

}
