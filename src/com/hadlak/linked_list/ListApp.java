package com.hadlak.linked_list;

public class ListApp {

    public static void main(String[] args) {
        MyLinkedList myList = new MyLinkedList(5);
        myList.printList();
        String values = "4 234 5 234 23 53 6 34 5 12 12312 23 4 23 65 8 67 8 234 2 54 545 123";
        for (String s : values.split(" ")) {
            myList.addListItem(new MyLinkedList(Integer.valueOf(s).intValue()));
        }
        System.out.println("+++++++++   print List      ++++++++++++");
         myList.printList();
        System.out.println("\n++++++++++++++++++++++++++++++++++++++++");
    }
}
