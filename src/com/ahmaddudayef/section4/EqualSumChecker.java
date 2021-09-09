package com.ahmaddudayef.section4;

public class EqualSumChecker {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1,-1, 0));
    }

    public static boolean hasEqualSum(int first, int second, int third) {
        return first + second == third;
    }
}
