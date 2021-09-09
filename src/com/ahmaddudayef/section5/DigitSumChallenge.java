package com.ahmaddudayef.section5;

public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println("The sum of digits in number 125 is "
                + sumDigits(125));
        System.out.println("The sum of digits in number 125 is "
                + sumDigits(-125));
        System.out.println("The sum of digits in number 125 is "
                + sumDigits(4));
        System.out.println("The sum of digits in number 125 is "
                + sumDigits(32123));
    }

    public static int sumDigits(int number) {
        if (number < 10) {
            return -1;
        }
        int sumDigit = 0;

        // 125 -> 125 / 10 = 12 -> 12 * 10 = 120 -> 125-120 = 5
        while (number > 0) {
            // extract the lest-significat digit
            int digit = number % 10;
            sumDigit += digit;

            // drop the lest significant digit
            number /= 10; // same as number = number / 10
        }
        return sumDigit;
    }
}
