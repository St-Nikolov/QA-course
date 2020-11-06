package com.javalectures.lecture06;

public class HomeWork {

    public void nameDayOfTheWeek(int dayNumber) {
        if (dayNumber<1 || dayNumber>7) {
            System.out.println("The weak has seven days, please choose real one.");
            return;
        }

        String dayName = "";

        switch (dayNumber) {
            case 1:
                dayName="Monday";
                break;
            case 2:
                dayName="Tuesday";
                break;
            case 3:
                dayName="Wednesday";
                break;
            case 4:
                dayName="Thursday";
                break;
            case 5:
                dayName="Frieday";
                break;
            case 6:
                dayName="Saturday";
                break;
            case 7:
                dayName="Sunday";
                break;
        }

        System.out.println("You entered " + dayNumber + ". So weak day is " + dayName);
    }

    public void calculatePerimeterAndAreaOfRectangle(int lenght, int width) {
        if ((lenght <= 0) || (width<=0)) {
            System.out.println("Lenght and width of the rectangle must be positive numbers");
            return;
        }

        int perimeter = (lenght + width)*2;
        int area = lenght*width;

        System.out.println("Perimeter of the rectangle is " + perimeter + " and the area is " + area);
    }

    public void checkNumberSign(int number){
        if(number < 0) {
            System.out.println(number + " is negative number.");
        } else if (number > 0) {
            System.out.println(number + " is positive number.");
        } else {
            System.out.println(number + " is zero.");
        }
    }

    public int findBiggestNumber(int number1,int number2,int number3){
        if (number1 > number2) {
            if (number1 > number3) {
                return number1;
            } else {
                return number3;
            }
        } else if (number2 > number3) {
            return number2;
        } else {
            return number3;
        }
    }
}
