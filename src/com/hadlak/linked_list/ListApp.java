package com.hadlak.linked_list;

public class ListApp {

    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList();
        // myList.printList();
        String values = "4 234 5 234 23 53 6 34 5 12 12312 23 4 23 65 8 67 8 234 2 54 545 123";
        for (String s : values.split(" ")) {
            myList.addListItem(new MyLinkedListItem(Integer.valueOf(s).intValue()));
        }
        System.out.println("+++++++++   print List      ++++++++++++");
         myList.printList();
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++");

        myList.moveToFirst();
        myList.moveToLast();

        System.out.println("Removing 12312");
        myList.removeListItem(new MyLinkedListItem(12312));
        System.out.println("+++++++++   print List      ++++++++++++");
        myList.printList();
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Removing 6");
        myList.removeListItem(new MyLinkedListItem(6));
        System.out.println("+++++++++   print List      ++++++++++++");
        myList.printList();
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Removing 123");
        myList.removeListItem(new MyLinkedListItem(123));
        System.out.println("+++++++++   print List      ++++++++++++");
        myList.printList();
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Removing 2");
        myList.removeListItem(new MyLinkedListItem(2));
        System.out.println("+++++++++   print List      ++++++++++++");
        myList.printList();
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Removing 123");
        myList.removeListItem(new MyLinkedListItem(123));
        System.out.println("+++++++++   print List      ++++++++++++");
        myList.printList();
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++");


    }
}
