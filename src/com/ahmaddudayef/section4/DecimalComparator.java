package com.ahmaddudayef.section4;

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 2.0));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber) {
        int myFirstCheck = (int)(firstNumber * 1000);
        int mySecondCheck = (int)(secondNumber * 1000);
        return myFirstCheck - mySecondCheck == 0;
    }
}
