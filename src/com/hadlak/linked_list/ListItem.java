package com.hadlak.linked_list;

public class ListItem extends MyListItem {

//    private MyListItem nextItem;
//    private MyListItem previousItem;

    public ListItem(int value) {
        super(value);
    }

    @Override
    public boolean setNextItem(MyListItem newNextItem) {
        if (newNextItem == null) {return false;}
        MyListItem oldNextItem = getNextItem();
        if (oldNextItem != null && oldNextItem.compareTo(newNextItem) != 0) {
            oldNextItem.setPreviousItem(newNextItem);
            super.setPreviousItem(oldNextItem);
//            super.setNextItem(newNextItem);
        }
        super.setNextItem(newNextItem);

        return true;
    }

    @Override
    public boolean setPreviousItem(MyListItem newPreviousItem) {
        if (newPreviousItem == null) {return false;}
        MyListItem oldPreviousItem = getPreviousItem();
        if (oldPreviousItem != null && oldPreviousItem.compareTo(newPreviousItem) != 0) {
            oldPreviousItem.setNextItem(newPreviousItem);
            super.setNextItem(oldPreviousItem);
//            newPreviousItem.setNextItem(getNextItem());
//            getNextItem().setPreviousItem(newPreviousItem);
        }
        super.setPreviousItem(newPreviousItem);
//        newPreviousItem.setNextItem(this);

//        newPreviousItem.setPreviousItem(getPreviousItem());
//        getPreviousItem().setPreviousItem(newPreviousItem);
//        setNextItem(newPreviousItem);
        // newItem.setNextItem(currentItem.getNextItem());
//        newItem.getNextItem().setPreviousItem(newItem);
//        newItem.setPreviousItem(currentItem);
//        newItem.getPreviousItem().setNextItem(newItem);
//
//        this.previousItem = previousItem;
        return true;
    }

    @Override
    public MyListItem getNextItem() {
        return super.getNextItem();
    }

    @Override
    public MyListItem getPreviousItem() {
        return super.getPreviousItem();
    }

    @Override
    public int compareTo(MyListItem listItem) {

        if ((int) listItem.getValue()== (int) getValue()){
            return 0;
        } else if ((int) listItem.getValue() > (int) getValue()){
            return 1;
        } else {
            return -1;
        }
    }
}
