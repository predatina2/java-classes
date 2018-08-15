package com.hadlak.linked_list;

public abstract class ListItem {

    protected Object value;
    protected ListItem previousItem;
    protected ListItem nextItem;

    public ListItem(Object value) {
        this.value = value;
    }

    abstract ListItem getPreviousItem();
    abstract ListItem getNextItem();
    abstract ListItem setNext(ListItem nextItem);
    abstract ListItem setPrevious(ListItem nextItem);
    abstract void removeNext();
    abstract void removePrevious();

    abstract int compareTo(ListItem listItem);

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
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

}
