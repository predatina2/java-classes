package com.hadlak;

import java.util.ArrayList;

public class GroceryList {

    private int[] myNumbers = new int[50];
    private ArrayList<String> groceryList = new ArrayList<String>( );

    public void addGroceryList(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("you have " + groceryList.size()
            + " items in your grocery List");
        for (int i = 0; i < groceryList.size(); i++){
            System.out.println(i + ": " + groceryList.get(i));
        }
    }

    public void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println(newItem + " new at position: " + position);
    }

    public void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("removed " + theItem + " at position " + position);
    }

    public void findItem(String searchItem) {
        boolean exists = searchItem.contains(searchItem);
        if (exists) {
            int position = groceryList.indexOf(searchItem);
            System.out.println("found " + searchItem + " at position " + position);
        } else {
            System.out.println("no item found");
        }

    }


}
