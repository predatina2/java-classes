package com.hadlak.linked_list;

public abstract class MyListItem {

    private Object value;
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

//    public abstract boolean addListItem(MyListItem newItem);

    public boolean setNextItem(MyListItem nextItem){
        this.nextItem = nextItem;
        return true;
    }

    public boolean setPreviousItem(MyListItem previousItem){
        this.previousItem = previousItem;
        return true;
    }

    public abstract int compareTo(MyListItem listItem);



}
