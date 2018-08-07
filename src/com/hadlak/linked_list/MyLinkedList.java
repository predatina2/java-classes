package com.hadlak.linked_list;

public class MyLinkedList extends MyListItem {

    public MyLinkedList(Object itsValue, MyListItem previousListItem, MyListItem nextListItem) {
        super(itsValue, previousListItem, nextListItem);
    }

    @Override
    public boolean setNextItem(MyListItem nextListItem) {
        super.setNextListItem(nextListItem); // TODO: Liste durchsuchen und vorher exis. privious nicht einfach wegschmeißen

        return false;
    }

    @Override
    public boolean setPreviousItem(MyListItem previousListItem) {
        super.setPreviousListItem(previousListItem); // TODO: Liste durchsuchen und vorher exis. privious nicht einfach wegschmeißen

        return false;
    }
}
