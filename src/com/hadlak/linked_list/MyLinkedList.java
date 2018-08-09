package com.hadlak.linked_list;

public class MyLinkedList {

    private MyListItem currentItem;

    public MyLinkedList() {
    }

    public boolean addListItem(ListItem newItem){
        System.out.println("add item");
        if (newItem == null) return false;
        if (currentItem == null) {
            currentItem = newItem;
            return true;
        }
        boolean findAddPosition = false;
        int newValue = (int) newItem.getValue();

        while (!findAddPosition){
            int currentValue = (int) currentItem.getValue();
            if (newValue == currentValue){
                System.out.println("values already in list: " + newValue);
                return false;
            } else if (newValue > currentValue){
                if (currentItem.getNextItem() == null){
                    currentItem.setNextItem(newItem);
                    newItem.setPreviousItem(currentItem);
                    System.out.println("add " + newValue);
                    findAddPosition = true;
                } else {
                    int nextValue = (int) currentItem.getNextItem().getValue();
                    if (newValue < nextValue){
                        newItem.setNextItem(currentItem.getNextItem());
                        newItem.setPreviousItem(currentItem);
                        currentItem.setNextItem(newItem);
                        System.out.println("add " + newValue);
                        findAddPosition = true;
                    } else {
                        currentItem = currentItem.getNextItem();
                    }
                }
            } else {
                if (currentItem.getPreviousItem() == null){
                    currentItem.setPreviousItem(newItem);
                    newItem.setNextItem(currentItem);
                    System.out.println("add " + newValue);
                    findAddPosition = true;
                } else {
                    int previousValue = (int) currentItem.getPreviousItem().getValue();
                    if (newValue > previousValue){
                        newItem.setPreviousItem(currentItem.getPreviousItem());
                        newItem.setNextItem(currentItem);
                        currentItem.setPreviousItem(newItem);
                        System.out.println("add " + newValue);
                        findAddPosition = true;
                    } else {
                        currentItem = currentItem.getPreviousItem();
                    }
                }
            }
        }

        return true;
    }

    /*
    public boolean addListItem(MyListItem newItem) {

        if (newItem == null) {
            return false;
        }
        if (currentItem == null) {
            currentItem = newItem;
            return true;
        }

        var newValue = (int) newItem.getValue();
        var currentValue = (int) currentItem.getValue();
        System.out.println(currentValue);

        MyListItem nextItem = null;
        if (currentItem.getNextItem() != null) {
            nextItem = currentItem.getNextItem();
        }

        MyListItem previousItem = null;
        if (currentItem.getPreviousItem() != null) {
            previousItem = currentItem.getPreviousItem();
        }

        if (currentValue == newValue) {
            return false;
        }
        if (currentValue < newValue) {
            if (nextItem == null) {
                newItem.setPreviousItem(currentItem);
                currentItem.setNextItem(newItem);
            } else if ((int) nextItem.getValue() > newValue) {
                newItem.setPreviousItem(currentItem);
                currentItem.setNextItem(newItem);
                newItem.addListItem(nextItem);
            } else {
                nextItem.addListItem(newItem);
            }
        } else if (currentValue > newValue) {
            if (previousItem == null) {
                newItem.setNextItem(currentItem);
                currentItem.setPreviousItem(newItem);
            } else if ((int) previousItem.getValue() < newValue) {
                newItem.setNextItem(currentItem);
                currentItem.setPreviousItem(newItem);
                newItem.addListItem(previousItem);
            } else {
                previousItem.addListItem(newItem);
            }
        }

        return true;
    }
    */

    public void printList() {
        if (currentItem == null) return;
        // MyListItem firstItem = currentItem;

        int count = 0;

        while (currentItem.getPreviousItem() != null) {
            count ++;
            System.out.println(count);
            currentItem = currentItem.getPreviousItem();
        }

        System.out.print((int)currentItem.getValue());

        while (currentItem.getNextItem() != null) {
            currentItem = currentItem.getNextItem();
            System.out.print((int) currentItem.getValue() + " ");
        }

    }
}
