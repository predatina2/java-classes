package com.example.hadlak.linked_list;

public class Node extends ListItem {

    public Node(int value) {
        super(value);
    }

    @Override
    public ListItem getNextItem() {
        return nextItem;
    }

    @Override
    public ListItem setNext(ListItem newNextItem) {

        if (newNextItem == null) {
            return null;
        }

        nextItem = newNextItem;
//        nextItem.previousItem = this;
        return nextItem;
    }

    @Override
    public ListItem getPreviousItem() {
        return previousItem;
    }

    @Override
    public ListItem setPrevious(ListItem newPreviousItem) {

        if (newPreviousItem == null) {
            return null;
        }

        previousItem = newPreviousItem;
//        previousItem.nextItem = this;
        return previousItem;
    }

    @Override
    public void removePrevious() {
        previousItem = null;
    }

    @Override
    public void removeNext() {
        nextItem = null;
    }

    @Override
    public int compareTo(ListItem item) {

        if (item != null) {
            if ((int) item.value == (int) value) {
                return 0;
            } else if ((int) item.value > (int) value) {
                return 1;
            } else {
                return -1;
            }
        } else {
            return -1; // TODO, hinterher nochmal gucken, ob compareTo angepasst werden muss
        }

    }

}
