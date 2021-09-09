package com.ahmaddudayef.section4;

public class SpeedConverter {

    public static void main(String[] args) {
        System.out.println(toMilesPerHour(0.0));
        printConversion(0.0);

    }

    public static long toMilesPerHour(double kilometersPerHour) {
        return kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour) {
        System.out.println(kilometersPerHour < 0 ? "Invalid Value" : kilometersPerHour + " km/h = " + toMilesPerHour(kilometersPerHour) + " mi/h");
    }
}
