package com.javalectures.lecture06;

import com.javalectures.lecture07.LoopExamples;

public class Main {


    public static void main(String[] args){
        HomeWork homeWork = new HomeWork();

        /* Exersize 1
          Name day of the week
         */

        homeWork.nameDayOfTheWeek(8);

        /* Exersize 2
        Calculate the area and the perimeter of a rectangle
         */

        homeWork.calculatePerimeterAndAreaOfRectangle(12,-5);

        /* Exersize 3
        Check if a number is positive or negative;
        Цифрите мисля не могат да бъдат положителни или отрицателни, направих го за int.
         */

        homeWork.checkNumberSign(-0);

        /* Exersize 4
        Find the biggest number ot tree.
        Отново го направих за int.
        Също виждам че има math пакет :)
         */

        int biggestNumber = homeWork.findBiggestNumber(9,9,5);
        System.out.println("The biggest number is : " + biggestNumber);

        LoopExamples loopExamples = new LoopExamples();
//        loopExamples.checkOperators();
        loopExamples.printAllArrayElements();
    }
}
