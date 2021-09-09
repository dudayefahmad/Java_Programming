package com.ahmaddudayef.section5;

public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        if (number < 0) {
            number *= -1;
        }

        int reverse = 0;
        int stored = number;
        while (stored > 0) {
            // extract the lest-significant digit
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            // drop the least-significant digit
            stored /= 10;
        }

        if (number == reverse) {
            return true;
        } else {
            return false;
        }
    }
}
