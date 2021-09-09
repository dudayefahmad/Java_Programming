package com.ahmaddudayef.section5;

public class DoWhileSample {

    public static void main(String[] args) {
        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        for (count = 1; count < 6; count++) {
//            System.out.println("Count value is " + count);
//        }

//        for (int i = 6; i != 6; i++) {
//            System.out.println("Count value is " + count);
//        }

//        count = 1;
//        while (true) {
//            if (count == 6) {
//                break;
//            }
//            System.out.println("Count value is " + count);
//            count++;
//        }

//        count = 6;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//
//            if (count > 100) {
//                break;
//            }
//        } while (count != 6);

//        int number = 4;
//        int finishNumber = 20;

//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//        }

        // Modify the while code above
        // Make it also record the total number of even numbers it has found
        // and break once 5 are found
        // and at the end, display the total number of even numbers found

        int number = 4;
        int finishNumber = 20;
        int evenNumberFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }
            System.out.println("Even number " + number);
            evenNumberFound++;
            if (evenNumberFound >= 5) {
                break;
            }
        }

        System.out.println("Total even number found " + evenNumberFound);
    }

    // Create a method called isEvenNumber that takes a parameter of type int
    // Its purpose is to determine if the argument passed to the method is
    // an even number or not.
    // return true if an even number, otherwise return false;

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }


}
