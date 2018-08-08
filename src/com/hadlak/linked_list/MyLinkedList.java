package com.hadlak.linked_list;

public class MyLinkedList {

    private MyListItem currentItem;

    public MyLinkedList() {
    }

    public boolean addListItem(MyListItem newItem){

        if (newItem == null) {
            return false;
        }
        if (currentItem == null){
            currentItem = newItem;
            return true;
        }

        var newValue = (int) newItem.getValue();
        var currentValue = (int) currentItem.getValue();
        System.out.println(currentValue);

        MyListItem nextItem = null;
        if (currentItem.getNextItem() != null) {
            nextItem = (MyLinkedList) getNextItem();
        }

        MyListItem previousItem = null;
        if (getPreviousItem() != null) {
            previousItem = (MyLinkedList) getPreviousItem();
        }
        try {
            if (currentValue == newValue) {
                return false;
            }
            if (currentValue < newValue) {
                if (nextItem == null) {
                    newItem.setPreviousItem(this);
                    setNextItem(newItem);
                } else if ((int) nextItem.getValue() > newValue) {
                    newItem.setPreviousItem(this);
                    setNextItem(newItem);
                    newItem.addListItem(nextItem);
                } else {
                    nextItem.addListItem(newItem);
                }
            } else if (currentValue > newValue) {
                if (previousItem == null) {
                    newItem.setNextItem(this);
                    setPreviousItem(newItem);
                } else if ((int) previousItem.getValue() < newValue) {
                    newItem.setNextItem(this);
                    setPreviousItem(newItem);
                    newItem.addListItem(previousItem);
                } else {
                    previousItem.addListItem(newItem);
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return true;
    }

    @Override
    public void printList(){
        MyLinkedList firstItem = this;

        while (firstItem.getPreviousItem() != null) {
            firstItem = (MyLinkedList) firstItem.getPreviousItem();
        }

        MyLinkedList nextItem = firstItem;
        if (nextItem != null){
            while (nextItem.getNextItem() != null){
                nextItem = (MyLinkedList) nextItem.getNextItem();
                System.out.print((int) nextItem.getValue() + " ");
            }

        }
    }

    @Override
    public Object getValue() {
        return super.getValue();
    }

    @Override
    public boolean setNextItem(MyListItem nextListItem) {
        super.setNextItem(nextListItem);

        return false;
    }

    @Override
    public boolean setPreviousItem(MyListItem previousListItem) {
        super.setPreviousItem(previousListItem);

        return false;
    }
}
