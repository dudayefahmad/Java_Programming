package com.ahmaddudayef.section5;

public class LastDigitChecker {

    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(41, 23, 71));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(23, 32, 44));
        System.out.println(hasSameLastDigit(9, 99, 999));
    }

    public static boolean hasSameLastDigit(int a, int b, int c) {
        if (isValid(a) && isValid(b) && isValid(c)) {
            int firstLastDigit = a % 10;
            int secondLastDigit = b % 10;
            int thirdLastDigit = c % 10;

            return (firstLastDigit == secondLastDigit) || (firstLastDigit == thirdLastDigit) || (secondLastDigit == thirdLastDigit);
        }
        return false;
    }

    public static boolean isValid(int number) {
        return (number >= 10) && (number <= 1000);
    }
}
