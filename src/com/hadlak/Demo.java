package com.hadlak;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class Demo {
    public static void main(String[] args) {
//        System.out.println("test");
//        LinkedList<String> placesToVisit = new LinkedList<String>();
//        placesToVisit.add("Sydney");
//        placesToVisit.add("Melbourne");
//        placesToVisit.add("Brisbane");
//        placesToVisit.add("Perth");
//        placesToVisit.add("Canberra");
//        placesToVisit.add("Adelaide");
//        placesToVisit.add("Darwin");
//
//        printList(placesToVisit);
//
//        placesToVisit.add(1, "Alice Springs");
//        printList(placesToVisit);
//
//        placesToVisit.remove(4);
//        printList(placesToVisit);

        LinkedList<String> placesToVisit2 = new LinkedList<String>();
        addInOrder(placesToVisit2, "Sydney");
        addInOrder(placesToVisit2,"Melbourne");
        addInOrder(placesToVisit2,"Brisbane");
        addInOrder(placesToVisit2,"Perth");
        addInOrder(placesToVisit2,"Canberra");
        addInOrder(placesToVisit2,"Adelaide");
        addInOrder(placesToVisit2,"Darwin");

        printList(placesToVisit2);
    }

    private static void printList(LinkedList<String> linkedList) {
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()) {
            System.out.println("Now visiting " + i.next());
        }
        System.out.println("=============================================");
    }

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity) {
        ListIterator<String> stringListIterator = linkedList.listIterator();

        while (stringListIterator.hasNext()) {
            int comparison = stringListIterator.next().compareTo(newCity);
            if (comparison == 0){
                // equal, do not add
                System.out.println(newCity + " is already included as a destination");
                return false;
            } else if (comparison > 0){
                // new city should appear before this one
                // Brisbane -> Adelaide
                stringListIterator.previous();
                stringListIterator.add(newCity);
                return true;
            } else {
                // move on next city
            }
        }

        stringListIterator.add(newCity);
        return true;
    }

    private static void sortAlphabeticalOrder(LinkedList<String> linkedList) {
        ListIterator<String> iterator = linkedList.listIterator();
        String temp = iterator.next();

        while (iterator.hasNext()) {
            int comparison = iterator.next().compareTo(temp);
            if (comparison == 0){
                // equal, do not change position
            } else if (comparison > 0){
                // temp should come before next, ok do nothing
                // Brisbane -> Adelaide
            } else {
                // change temp with next;
                temp = iterator.toString();
                iterator.remove();
                iterator.previous();
                iterator.previous();
                iterator.add(temp);
            }
        }

        stringListIterator.add(newCity);
    }
}
