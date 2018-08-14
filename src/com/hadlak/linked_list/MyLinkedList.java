package com.hadlak.linked_list;

public class MyLinkedList {

    private MyListItem currentItem;
    private MyListItem firstItem;
    private MyListItem lastItem;

    public MyLinkedList() {
    }

    public boolean addListItem(MyLinkedListItem newItem) {
        if (newItem == null) return false;
        if (currentItem == null) {
            currentItem = newItem;
            firstItem = newItem;
            lastItem = newItem;
            return true;
        }

        System.out.println(" +++++ Start adding: " + newItem.getValue() + " +++++ ");

        moveToFirst();
        boolean findAddPosition = false;
        while (!findAddPosition) {
//            System.out.println("compare current: " + (int) currentItem.getValue() + " with new value");
            int compare = currentItem.compareTo(newItem);
            if (compare == 0) {
                System.out.println("current value equals new value:");
                return false;
            } else if (compare > 0){
                System.out.println("current value is smaller then new value");
                System.out.println("iterate up the list");
                if (!currentItem.hasNextItem()) {
                    currentItem.insertAfter(newItem);
                    lastItem = newItem;
                    System.out.println("found end of the list. " + (int) newItem.getValue() + " added");
                    findAddPosition = true;
                } else {
                    compare = currentItem.getNextItem().compareTo(newItem);
                    System.out.println("compare new value with next value: " + (int) currentItem.getNextItem().getValue());
                    if (compare < 0) {
                        System.out.println("new value is less than next value");
                        System.out.println("new value is added between " + (int) currentItem.getValue() + " and "
                                + (int) currentItem.getNextItem().getValue());
                        currentItem.getNextItem().insertBefore(newItem);
                        currentItem.insertAfter(newItem);
                        findAddPosition = true;
                    } else {
                        System.out.println("new value is greater then next value. Setting current value to next value.");
                        moveToRight();
                    }
                }
            } else {
                System.out.println("current value is greater than new value");
                System.out.println("found end of the list. " + (int) newItem.getValue() + " added");
                currentItem.insertBefore(newItem);
                firstItem = newItem;
                findAddPosition = true;
            }
        }

        return true;
    }


    public boolean removeListItem(MyListItem itemToRemove) {
        if (itemToRemove == null || currentItem == null) {
            return false;
        }
//TODO: last wird nicht angepasst
        moveToFirst();
        boolean foundItem = false;
        while (!foundItem){
            int compare = currentItem.compareTo(itemToRemove);
            if (compare == 0){
                if (currentItem == firstItem){
                    firstItem = currentItem.getNextItem();
                    currentItem = firstItem;
                    currentItem.removeBefore();
                } else {
                    currentItem = currentItem.getPreviousItem();
                    currentItem.insertAfter(currentItem.getNextItem().getNextItem());
                }
                foundItem = true;
            } else {
                if (!moveToRight()) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean moveToLeft() {
        if (currentItem == null || !currentItem.hasValue() || !currentItem.hasPreviousItem()) {
            return false;
        } else {
            currentItem = currentItem.getPreviousItem();
            return true;
        }

    }

    public boolean moveToRight() {
        if (currentItem == null || !currentItem.hasValue() || !currentItem.hasNextItem()) {
            return false;
        } else {
            currentItem = currentItem.getNextItem();
            return true;
        }

    }

    public void moveToFirst() {
        while (currentItem.hasPreviousItem()) {
            moveToLeft();
        }
//        System.out.println("moved to first: " + currentItem.getValue());
    }

    public void moveToLast() {
        while (currentItem.hasNextItem()) {
            moveToRight();
        }
//        System.out.println("moved to last: " + currentItem.getValue());
    }


    public void printList() {
        if (currentItem == null) return;
        moveToFirst();

        System.out.print(currentItem.getValue() + " ");
        while (currentItem.hasNextItem()) {
            moveToRight();
            System.out.print((int) currentItem.getValue() + " ");
        }

    }
}
