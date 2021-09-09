package com.ahmaddudayef.section4;

public class MinutesToYearsDaysCalculator {

    private static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {
        printYearsAndDays(525600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            long years = minutes / 525600;
            long days = (minutes % 525600) / 1440;

            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
