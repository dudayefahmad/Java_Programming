package com.ahmaddudayef.section5;

import java.util.Scanner;

public class ReadingInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;

        // solution 1
        while (true) {
            int order = counter + 1;
            System.out.println("Enter number #" + order + ":");

            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                counter++;
                sum += number;
                if (counter == 10) {
                    break;
                }
            } else {
                System.out.println("Invalid number");
            }

            scanner.nextLine(); // handle end of line (enter key)
        }

        // solution 2
//        while (counter < 10) {
//            int order = counter + 1;
//            System.out.println("Enter number #" + order + ":");
//
//            boolean isAnInt = scanner.hasNextInt();
//
//            if (isAnInt) {
//                int number = scanner.nextInt();
//                counter++;
//                sum += number;
//            } else {
//                System.out.println("Invalid number");
//            }
//
//            scanner.nextLine(); // handle end of line (enter key)
//        }

        System.out.println("sum = " + sum);

        scanner.close();
    }


}
