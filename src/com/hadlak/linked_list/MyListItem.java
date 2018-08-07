package com.hadlak.linked_list;

public abstract class MyListItem {

    private Object itsValue;
    private MyListItem previousListItem;
    private MyListItem nextListItem;

    public MyListItem(Object itsValue, MyListItem previousListItem, MyListItem nextListItem) {
        this.itsValue = itsValue;
        this.previousListItem = previousListItem;
        this.nextListItem = nextListItem;
    }

    public Object getItsValue() {
        return itsValue;
    }

    public void setItsValue(Object itsValue) {
        this.itsValue = itsValue;
    }

    public MyListItem getPreviousListItem() {
        return previousListItem;
    }

    public void setPreviousListItem(MyListItem previousListItem) {
        this.previousListItem = previousListItem;
    }

    public MyListItem getNextListItem() {
        return nextListItem;
    }

    public void setNextListItem(MyListItem nextListItem) {
        this.nextListItem = nextListItem;
    }

    public MyListItem toNextItem(){
        if (nextListItem != null) {
            return nextListItem;
        } else {
            return null;
        }
    };

    public MyListItem toPreviousItem(){
        if (nextListItem != null) {
            return previousListItem;
        } else {
            return null;
        }
    };

    public abstract boolean setNextItem(MyListItem nextListItem);

    public abstract boolean setPreviousItem(MyListItem previousListItem);



}
