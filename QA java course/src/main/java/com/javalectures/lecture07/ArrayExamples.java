package com.javalectures.lecture07;

public class ArrayExamples {

    public static int[] getArrayWith20Elements(){
        int[] array = new int[20];

        for (int i=0; i<20; i++) {
           array[i] = i*5;
           System.out.println(i + " : " + array[i]);
        }
        return array;
    }

    public static float getArithmeticMean(int[] array){
        int sum = 0;
        for (int element:array) {
            sum+=element;
        }
        return sum/(array.length);
    }

    public static void calculateSums(int[] array){
        int sumOfOdd = 0;
        int sumOfEven = 0;

        System.out.print("\nArray : ");

        for (int element:array) {
            System.out.print(element + ", ");
            if ((element%2)==0) sumOfEven+=element;
            else sumOfOdd+=element;
        }
        System.out.println("\b\b");

        System.out.printf("The sum of odd elements is : %d , and sum of the even elements is : %d", sumOfOdd, sumOfEven );
    }
}
