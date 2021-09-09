package com.ahmaddudayef.section8.arraylist;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceryList.add(item);
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void printGroceryList() {
        System.out.println("You have " + groceryList.size() + " item in " +
                "your grocerylist");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println((i+1) + ". " + groceryList.get(i));
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println("Grocery Item " + (position + 1) + " has been modified.");
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(currentItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void removeGroceryItem(int position) {
        groceryList.remove(position);
    }

    public void removeGroceryItem(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private int findItem(String searchItem) {
        return groceryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem) {
        int position =  findItem(searchItem);
        if (position > 0) {
            return true;
        }
        return false;
    }

//    public String findItem(String searchItem) {
//        int position = groceryList.indexOf(searchItem);
//        if (position >= 0) {
//            return groceryList.get(position);
//        }
//
//        return null;
//    }

//    public String findItem(String searchItem) {
//        boolean exists = groceryList.contains(searchItem);
//        if (exists) {
//            int position = groceryList.indexOf(searchItem);
//            return groceryList.get(position);
//        }
//        return null;
//    }
}
