package com.hadlak.linked_list;

public class ListItem extends MyListItem {

    public ListItem(Object value) {
        super(value);
    }

    @Override
    public boolean addListItem(MyListItem newItem) {
        return false;
    }

    @Override
    public boolean setNextItem(MyListItem nextListItem) {
        return false;
    }

    @Override
    public boolean setPreviousItem(MyListItem previousListItem) {
        return false;
    }

    @Override
    public void printList() {

    }
}
