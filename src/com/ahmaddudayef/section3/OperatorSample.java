package com.ahmaddudayef.section3;

public class OperatorSample {

    public static void main(String[] args) {
        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;
        System.out.println("3-1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the reminder of (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        // resutl = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 2 = " + result);

        // result = result + 2;
        result += 2;
        System.out.println("1 + 2 = " + result);

        // result = result * 10;
        result *= 10;
        System.out.println("3 * 10 = " + result);

        // result = result / 3;
        result /= 3;
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2;
        System.out.println("10 - 2 = " + result);

        boolean isAliean = false;
        if (isAliean == false) {
            System.out.println("It is not an alien!");
            System.out.println("Am i am scared of alien");
        }

        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if (((topScore > 90)) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the condtion are true");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if (isCar) {
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("wascar is true");
        }


        // Chaleenge
        double myFirstValue = 20.00d;
        double mySecondValue = 80.00d;
        double myValuesTotal = (myFirstValue + mySecondValue) * 100.00d;
        System.out.println("calculateDoubleValue= " + myValuesTotal);
        double theRemainder = myValuesTotal % 40.00d;
        System.out.println("the remainder is = " + theRemainder);
        boolean isNoRemainder = (theRemainder == 0) ? true : false;
        System.out.println("isNoReminder = " + isNoRemainder);
        if (!isNoRemainder) {
            System.out.println("Got some remainder");
        }

    }
}
