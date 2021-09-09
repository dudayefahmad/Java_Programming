package com.ahmaddudayef.section5;

public class SharedDigit {

    public static void main(String[] args) {

    }

    public static boolean hasSharedDigit(int firstNumber, int secondNumber) {
        if ((firstNumber < 10) || (firstNumber> 99) || (secondNumber < 10) || (secondNumber > 99)) {
            return false;
        }
        return((firstNumber/10 == secondNumber/10)||(firstNumber/10 == secondNumber % 10)
                ||(secondNumber/10 == firstNumber % 10)||(firstNumber%10 == secondNumber%10));
    }
}
