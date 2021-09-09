package com.ahmaddudayef.section5;

public class EvenDigitSum {

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));
    }

    public static int getEvenDigitSum(int number) {
        if (number < 0) {
            return -1;
        }
        int sumDigit = 0;
        while (number > 0) {
            // extract the lest-significat digit
            int digit = number % 10;
            if (digit % 2 != 0) {
                number /= 10;
                continue;
            }
            sumDigit += digit;

            // drop the lest significant digit
            number /= 10;
        }
        return sumDigit;
    }
}
