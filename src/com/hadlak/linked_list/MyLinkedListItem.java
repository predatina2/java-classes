package com.hadlak.linked_list;

public class MyLinkedListItem extends MyListItem {

    public MyLinkedListItem(int value) {
        super(value);
    }

    public boolean insertAfter(MyListItem newNextItem) {
//        System.out.println("set next Item: " + newNextItem.getValue());
        if (newNextItem == null) {
            return false;
        }

        nextItem = newNextItem;
        newNextItem.previousItem = this;
        return true;
    }

    public boolean insertBefore(MyListItem newPreviousItem) {
//        System.out.println("set Previous item: " + newPreviousItem.getValue());

        if (newPreviousItem == null) {
            return false;
        }

        previousItem = newPreviousItem;
        newPreviousItem.nextItem = this;
        return true;
    }

    @Override
    public void removeBefore() {
        previousItem = null;
    }

    @Override
    public void removeAfter() {
        nextItem = null;
    }

    @Override
    public int compareTo(MyListItem listItem) {

        if ((int) listItem.value == (int) value) {
            return 0;
        } else if ((int) listItem.value > (int) value) {
            return 1;
        } else {
            return -1;
        }
    }
}
