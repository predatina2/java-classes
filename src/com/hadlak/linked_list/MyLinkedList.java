package com.hadlak.linked_list;

public class MyLinkedList {

    private MyListItem currentItem;
    private MyListItem firstItem;
    private MyListItem lastItem;

    public MyLinkedList() {
    }

    public boolean addListItem(ListItem newItem){
        if (newItem == null) return false;
        if (currentItem == null) {
            currentItem = newItem;
            firstItem = newItem;
            lastItem = newItem;
            return true;
        }

        boolean findAddPosition = false;

        System.out.println(" +++++ Start adding: " + (int) newItem.getValue() + " +++++ ");

        while (!findAddPosition){
            System.out.println("compare current: " + (int) currentItem.getValue() + " with new value");
            int compare = currentItem.compareTo(newItem);
            if (compare == 0){
                System.out.println("current value equals new value:");
                return false;
            } else if (compare > 0){
                System.out.println("current value is smaller then new value");
                System.out.println("iterate up the list");
                if (currentItem.getNextItem() == null){
                    currentItem.insertAfter(newItem);
                    System.out.println("found end of the list. " + (int) newItem.getValue() + " added");
                    findAddPosition = true;
                } else {
                    compare = currentItem.getNextItem().compareTo(newItem);
                    System.out.println("compare new value with next value: " + (int) currentItem.getNextItem().getValue());
                    if (compare < 0){
                        System.out.println("new value is less than next value");
                        System.out.println("new value is added between " + (int) currentItem.getValue()+ " and "
                        + (int)currentItem.getNextItem().getValue());
                        currentItem.insertAfter(newItem);
                        findAddPosition = true;
                    } else {
                        System.out.println("new value is greater then next value. Setting current value to next value.");
                        currentItem = currentItem.getNextItem();
                    }
                }
            } else {
                System.out.println("current value is greater than new value");
                if (currentItem.getPreviousItem() == null){
                    System.out.println("found end of the list. " + (int) newItem.getValue() + " added");
                    currentItem.insertBefore(newItem);
                    findAddPosition = true;
                } else {
                    compare = currentItem.getPreviousItem().compareTo(newItem);
                    System.out.println("compare new value with previous value: " + (int) currentItem.getPreviousItem().getValue());
                    if (compare > 0){
                        System.out.println("new value is greater than previous value");
                        System.out.println("new value is added between " + (int) currentItem.getValue()+ " and "
                                + (int)currentItem.getPreviousItem().getValue());
                        currentItem.insertBefore(newItem);
                        findAddPosition = true;
                    } else {
                        System.out.println("new value is smaller then previous value. Setting current value to previous value.");
                        currentItem = currentItem.getPreviousItem();
                    }
                }
            }
        }

        return true;
    }

    /*
    public boolean addListItem(ListItem newItem){
        if (newItem == null) return false;
        if (currentItem == null) {
            currentItem = newItem;
            firstItem = newItem;
            lastItem = newItem;
            return true;
        }
        boolean findAddPosition = false;
        int newValue = (int) newItem.getValue();
         System.out.println("Start find add " + newValue + " ");

        while (!findAddPosition){
            int currentValue = (int) currentItem.getValue();
            System.out.println("current: " + currentValue + " ");
            if (newValue == currentValue){
                // System.out.println("values already in list: " + newValue);
                return false;
            } else if (newValue > currentValue){
                if (currentItem.getNextItem() == null){
                    currentItem.setNextItem(newItem);
                    newItem.setPreviousItem(currentItem);
                    // System.out.println("add up last" + newValue);
                    findAddPosition = true;
                } else {
                    int nextValue = (int) currentItem.getNextItem().getValue();
                    if (newValue < nextValue){
                        newItem.setNextItem(currentItem.getNextItem());
                        newItem.getNextItem().setPreviousItem(newItem);
                        newItem.setPreviousItem(currentItem);
                        newItem.getPreviousItem().setNextItem(newItem);
                        // System.out.println("add up between" + newValue);
                        findAddPosition = true;
                    } else {
                        currentItem = currentItem.getNextItem();
                    }
                }
            } else {
                if (currentItem.getPreviousItem() == null){
                    currentItem.setPreviousItem(newItem);
                    newItem.setNextItem(currentItem);
                    // System.out.println("add down last" + newValue);
                    findAddPosition = true;
                } else {
                    int previousValue = (int) currentItem.getPreviousItem().getValue();
                    if (newValue > previousValue){
                        newItem.setPreviousItem(currentItem.getPreviousItem());
                        newItem.getPreviousItem().setNextItem(newItem);
                        newItem.setNextItem(currentItem);
                        newItem.getNextItem().setPreviousItem(newItem);
                        // System.out.println("add down between" + newValue);
                        findAddPosition = true;
                    } else {
                        currentItem = currentItem.getPreviousItem();
                    }
                }
            }
        }

        return true;
    }*/

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
