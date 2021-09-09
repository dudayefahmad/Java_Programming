package com.ahmaddudayef.section5;

public class FactorPrinter {

    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-10);
    }

    public static void printFactors(int number) {
        if(number<1) {
            System.out.print("Invalid Value");
            return; // add to "break" out of the method
        }
        // for(int i=1; i<=number; i++){
        for(int i=1; i<=number/2; i++){ // optimize to loop just half of the number
            if(number%i==0) System.out.print(i + " ");
        }
        System.out.print(number); // print last value
    }
}
