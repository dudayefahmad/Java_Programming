package com.ahmaddudayef.section8.autoboxing_unboxing;

import java.lang.reflect.Array;
import java.util.ArrayList;

class IntClass {
    private int number;

    public IntClass(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}

public class Recap {

    public static void main(String[] args) {
        String[] strArray = new String[10];
        int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<>();
        strArrayList.add("Tim");

//        ArrayList<int> intArrayList = new ArrayList<int>();
        ArrayList<IntClass> intClassArrayList = new ArrayList<>();
        Integer integer = new Integer(54);
        Double doubleValue = new Double(12.45);

        ArrayList<Integer> intArrayList = new ArrayList<>();
//        for (int i = 0; i <= 10; i++) {
//            // autoboxing
//            intArrayList.add(Integer.valueOf(i));
//        }
//
//
//        for (int i = 0; i <= 10; i++) {
//            // unboxing
//            System.out.println(i + " ->" + intArrayList.get(i).intValue());
//        }

        Integer myIntValue = 56; // Integer.valueOf(56)
        int myInt = myIntValue.intValue(); // myInt.intValue();

        ArrayList<Double> myDoubleValue = new ArrayList<>();
        for (double dbl = 0.0; dbl <= 10.0; dbl += 0.5) {
            // autoboxing
            myDoubleValue.add(dbl);
        }

        for (int i = 0; i < myDoubleValue.size(); i++) {
            // unboxing
            double value = myDoubleValue.get(i);
            System.out.println(i + " -> " + value);
        }

    }
}
