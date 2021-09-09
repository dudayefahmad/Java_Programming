package com.ahmaddudayef.section5;

public class DayOfTheWeekChallenge {

    public static void main(String[] args) {
        printDayOfTheWeek(9);

    }

    public static void printDayOfTheWeek(int day) {
        switch (day) {
            case 0:
                System.out.println("Sunday");
                break;
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Thuesday");
                break;
            case 3:
                System.out.println("Wednesdey");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Invalid day");
                break;
        }
    }
}
