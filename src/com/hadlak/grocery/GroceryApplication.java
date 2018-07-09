package com.hadlak.grocery;

import java.util.Scanner;

public class GroceryApplication {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public void startGroceryApplication(){

//        groceryList.addGroceryList("apple");
//        groceryList.addGroceryList("pea");
//        groceryList.addGroceryList("banana");
//        groceryList.addGroceryList("chips");
//        groceryList.addGroceryList("coke");
//        groceryList.addGroceryList("ketchup");
//        groceryList.addGroceryList("salad");


        boolean quit = false;
        int choice = 0;
        while (!quit) {
            System.out.println("enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;

            }
        }

    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of grocery items.");
        System.out.println("\t 2 - To add an item to the list.");
        System.out.println("\t 3 - To modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for an item in the list.");
        System.out.println("\t 6 - To quit the application.");
    }

    public static void addItem() {
        System.out.println("++++++++++ adding new grocery item ++++++++++");
        System.out.println("please enter the name of the new item: ");
        groceryList.addGroceryList(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Please enter the name of the item: ");
        String oldItem = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(oldItem, newItem);
    }

    public static void removeItem() {
        System.out.println("Please enter the name of the item to remove: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem() {
        System.out.println("Please enter the item you want to search for: ");
        String searchItem = scanner.nextLine();
        groceryList.searchForItem(searchItem);
    }
}
