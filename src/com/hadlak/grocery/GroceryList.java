package com.hadlak.grocery;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceryList = new ArrayList<String>();

    public void addGroceryList(String item) {
        groceryList.add(item);
    }

    public void printGroceryList() {
        System.out.println("you have " + groceryList.size()
                + " items in your grocery List");
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println(i + 1 + ": " + groceryList.get(i));
        }
    }

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void modifyGroceryItem(String oldItem, String newItem) {
        int position = searchForItem(oldItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceryList.set(position, newItem);
        System.out.println(newItem + " new at position: " + position);
    }

    public void removeGroceryItem(String item) {
        int position = searchForItem(item);
        if (position >= 0) {
            removeGroceryItem(position);
        }
    }

    private void removeGroceryItem(int position) {
        String theItem = groceryList.get(position);
        groceryList.remove(position);
        System.out.println("removed " + theItem + " at position " + position);
    }

    public int searchForItem(String searchItem) {
        boolean exists = searchItem.contains(searchItem);
        if (exists) {
            int position = groceryList.indexOf(searchItem);
            System.out.println("found " + searchItem + " at position " + position);
            return position;
        } else {
            System.out.println("no item found");
            return -1;
        }
    }


}
