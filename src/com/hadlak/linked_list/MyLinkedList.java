package com.hadlak.linked_list;

public class MyLinkedList {

    private MyListItem currentItem;
    private MyListItem firstItem; // TODO implementing
    private MyListItem lastItem; // TODO implementing

    public MyLinkedList() {
    }

    public boolean addListItem(ListItem newItem) {
        if (newItem == null) return false;
        if (currentItem == null) {
            currentItem = newItem;
            firstItem = newItem;
            lastItem = newItem;
            return true;
        }

        boolean findAddPosition = false;

        System.out.println(" +++++ Start adding: " + (int) newItem.getValue() + " +++++ ");

        while (!findAddPosition) {
            System.out.println("compare current: " + (int) currentItem.getValue() + " with new value");
            int compare = currentItem.compareTo(newItem);
            if (compare == 0) {
                System.out.println("current value equals new value:");
                return false;
            } else if (compare > 0) {
                System.out.println("current value is smaller then new value");
                System.out.println("iterate up the list");
                if (currentItem.getNextItem() == null) {
                    currentItem.insertAfter(newItem);
                    System.out.println("found end of the list. " + (int) newItem.getValue() + " added");
                    findAddPosition = true;
                } else {
                    compare = currentItem.getNextItem().compareTo(newItem);
                    System.out.println("compare new value with next value: " + (int) currentItem.getNextItem().getValue());
                    if (compare < 0) {
                        System.out.println("new value is less than next value");
                        System.out.println("new value is added between " + (int) currentItem.getValue() + " and "
                                + (int) currentItem.getNextItem().getValue());
                        currentItem.insertAfter(newItem);
                        findAddPosition = true;
                    } else {
                        System.out.println("new value is greater then next value. Setting current value to next value.");
                        moveToRight();
                    }
                }
            } else {
                System.out.println("current value is greater than new value");
                if (currentItem.getPreviousItem() == null) {
                    System.out.println("found end of the list. " + (int) newItem.getValue() + " added");
                    currentItem.insertBefore(newItem);
                    findAddPosition = true;
                } else {
                    compare = currentItem.getPreviousItem().compareTo(newItem);
                    System.out.println("compare new value with previous value: " + (int) currentItem.getPreviousItem().getValue());
                    if (compare > 0) {
                        System.out.println("new value is greater than previous value");
                        System.out.println("new value is added between " + (int) currentItem.getValue() + " and "
                                + (int) currentItem.getPreviousItem().getValue());
                        currentItem.insertBefore(newItem);
                        findAddPosition = true;
                    } else {
                        System.out.println("new value is smaller then previous value. Setting current value to previous value.");
                        moveToLeft();
                    }
                }
            }
        }

        return true;
    }

    public boolean removeListItem(MyListItem itemToRemove) {
        if (itemToRemove == null || currentItem == null) {
            return false;
        }
        boolean foundItem = false;

        moveToFirst();
        while (!foundItem){
            int compare = currentItem.compareTo(itemToRemove);
            if (compare == 0){
                if (currentItem == firstItem){
                    firstItem = currentItem.getNextItem();
                    currentItem = firstItem;
                    currentItem.removeBefore();
                    foundItem = true;
                } else {
                    currentItem = currentItem.getPreviousItem();
                    currentItem.setNextItem(currentItem.getNextItem().getNextItem());
                    foundItem = true;
                }
            } else {
                if (!moveToRight()) {
                    return false;
                }
            }
        }
        return true;

//        while (!foundItem) {
//            if (currentItem == null) {
//                return false;
//            }
//            int compare = currentItem.compareTo(itemToRemove);
//            if (compare == 0) {
//                if (moveToLeft()) {
//                    currentItem.removeAfter();
//                } else if (moveToRight()) {
//                    currentItem.removeBefore();
//                } else {
//                    currentItem.setValue(null);
//                }
//                foundItem = true;
//            } else if (compare > 0) {
//                if (currentItem.getNextItem().compareTo(itemToRemove) > 0 && !moveToRight()) {
//                    return false;
//                }
//                System.out.println("move to right");
//            } else {
//                if (currentItem.getPreviousItem().compareTo(itemToRemove) > 0 && !moveToLeft()) {
//                    return false;
//                }
//                System.out.println("move to left");
//            }
//        }
//
//        return true;
    }

    public boolean moveToLeft() {
        if (currentItem == null || currentItem.getValue() == null || currentItem.getPreviousItem() == null) {
            return false;
        } else {
            currentItem = currentItem.getPreviousItem();
            return true;
        }

    }

    public boolean moveToRight() {
        if (currentItem == null || currentItem.getValue() == null || currentItem.getNextItem() == null) {
            return false;
        } else {
            currentItem = currentItem.getNextItem();
            return true;
        }

    }

    public void moveToFirst() {
        while (moveToLeft()) {

        }
        System.out.println("moved to first: " + currentItem.getValue());
    }

    public void moveToLast() {
        while (moveToRight()) {

        }
        System.out.println("moved to last: " + currentItem.getValue());
    }


    public void printList() {
        if (currentItem == null) return;

        while (currentItem.getPreviousItem() != null) {
            currentItem = currentItem.getPreviousItem();
        }

        System.out.print(currentItem.getValue() + " ");
        while (currentItem.getNextItem() != null) {
            currentItem = currentItem.getNextItem();
            System.out.print((int) currentItem.getValue() + " ");
        }

    }
}
