package com.hadlak.linked_list;

public abstract class MyListItem {

    protected Object value;
    protected MyListItem previousItem;
    protected MyListItem nextItem;

    public MyListItem(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public MyListItem getPreviousItem() {
        return previousItem;
    }

    public MyListItem getNextItem() {
        return nextItem;
    }

    public boolean hasNextItem(){
        return (nextItem != null) ? true : false;
    }

    public boolean hasPreviousItem(){
        return (previousItem != null) ? true : false;
    }

    public boolean hasValue(){
        return (value != null) ? true : false;
    }

    public abstract boolean insertAfter(MyListItem nextItem);
    public abstract boolean insertBefore(MyListItem nextItem);
    public abstract void removeAfter();
    public abstract void removeBefore();

    public abstract int compareTo(MyListItem listItem);
}
