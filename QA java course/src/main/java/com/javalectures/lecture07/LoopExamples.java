package com.javalectures.lecture07;

public class LoopExamples {

//    public void checkOperators(){
//        for (int i = 1; i<5 ; i++)
//            System.out.println(i);
//        for (int i = 1; i<5 ; ++i) System.out.println(i);
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(++x);
//    }
//
    public void printAllArrayElements(){
        int[] array = {1,2,3,4,5};
        for (int i : array) {
            System.out.println(i);

        }
    }

    public static void printAllNumbers(int lastNumber){
        System.out.printf("\nAll numbers from 1 to %d are :\n", lastNumber);
        for (int i=1;i<=lastNumber;i++) System.out.print(i + ", ");
        System.out.println("\b\b");
    }

    public static void printNumbers(int lastNumber){
        System.out.printf("\nNumbers from 1 to %d, that are not multiple of 3 or 7, are :\n", lastNumber);
        for (int i=1;i<=lastNumber;i++) {
            if ((i%3 != 0) && (i%7 != 0))  System.out.print(i + ", ");
        }
        System.out.println("\b\b");
    }

    public static int calculateFibonacci(int lenght){
        if (lenght<=0) {
            System.out.println("Incorect lenght");
            return -1;
        }
        if (lenght == 1) {
            System.out.println("The sum is 0");
            return 0;
        }
        if (lenght == 2) {
            System.out.println("The sum is 1");
            return 1;
        }

        int secondLastElement = 0;
        int lastElement = 1;
        int temp;
        int fibonacciSum = 1;
        System.out.print("\n0, 1");
        for (int i=3; i<=lenght; i++){
            temp = lastElement;
            lastElement += secondLastElement;
            secondLastElement = temp;
            fibonacciSum += lastElement;
            System.out.print(", " + lastElement);
        }
        System.out.printf("\nSum of first %d Fibonacci numbers is : %d" , lenght,fibonacciSum);
        return fibonacciSum;
    }

}
