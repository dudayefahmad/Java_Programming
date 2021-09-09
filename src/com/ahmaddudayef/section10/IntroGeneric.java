package com.ahmaddudayef.section10;

import java.util.ArrayList;

public class IntroGeneric {

    public static void main(String[] args) {
        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
//        items.add("tims");
        items.add(4);
        items.add(5);

        printDoubled(items);
    }

    private static void printDoubled(ArrayList<Integer> item) {
        for (int i : item) {
            System.out.println(i * 2);
        }
    }
}
