package com.hadlak.linked_list;

public class ListItem extends MyListItem {

    private MyListItem nextItem;
    private MyListItem previousItem;

    public ListItem(int value) {
        super(value);
    }

    @Override
    public boolean setNextItem(MyListItem nextItem) {
        this.nextItem = nextItem;
        return true;
    }

    @Override
    public boolean setPreviousItem(MyListItem previousItem) {
        this.previousItem = previousItem;
        return true;
    }

    @Override
    public MyListItem getNextItem() {
        return nextItem;
    }

    @Override
    public MyListItem getPreviousItem() {
        return previousItem;
    }
}
