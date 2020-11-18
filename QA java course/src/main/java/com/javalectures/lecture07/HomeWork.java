package com.javalectures.lecture07;

public class HomeWork {

    public static void main(String[] args) {


        int [] array = ArrayExamples.getArrayWith20Elements();
        System.out.printf("Arithmetic mean of the array is : %f" , ArrayExamples.getArithmeticMean(array));
        int [] array2 = {1,5,6,82,45};
        ArrayExamples.calculateSums(array2);


        LoopExamples.printAllNumbers(10);
        LoopExamples.printNumbers(23);
        int fibonacciSum = LoopExamples.calculateFibonacci(23);
    }
}
