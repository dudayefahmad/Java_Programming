package com.ahmaddudayef.section5;

public class FlourPacker {

    public static void main(String[] args) {
        canPack(2,1,10);
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        //#1 validation
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        // #2 supply must be greater than demand
        if (bigCount*5 + smallCount < goal) {
            return false;
        }
        // #3 regardless of bigCount, remainder of goal has to be less than smallCount
        return (goal%5 <= smallCount);
    }
}
