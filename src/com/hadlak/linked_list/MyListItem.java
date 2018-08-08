package com.hadlak.linked_list;

public abstract class MyListItem {

    private Object value; // just Value
    private MyListItem previousItem;
    private MyListItem nextItem;

    public MyListItem(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public MyListItem getPreviousItem() {
        return previousItem;
    }

    public MyListItem getNextItem() {
        return nextItem;
    }

    public abstract boolean addListItem(MyListItem newItem);

    public abstract boolean setNextItem(MyListItem nextListItem);

    public abstract boolean setPreviousItem(MyListItem previousListItem);

    public abstract void printList();



}
