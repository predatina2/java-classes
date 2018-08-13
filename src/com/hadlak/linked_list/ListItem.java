package com.hadlak.linked_list;

public class ListItem extends MyListItem {

//    private MyListItem nextItem;
//    private MyListItem previousItem;

    public ListItem(int value) {
        super(value);
    }


    public boolean insertAfter(MyListItem newNextItem) {
//        System.out.println("set next Item: " + newNextItem.getValue());
        if (newNextItem == null) {return false;}

        MyListItem oldNextItem = getNextItem();
        if (oldNextItem == null) {
            super.setNextItem(newNextItem);
            newNextItem.setPreviousItem(this);
            return true;
        }
        if (oldNextItem.compareTo(newNextItem) == 0) {
            return false;
        } else {
            oldNextItem.setPreviousItem(newNextItem);
            newNextItem.setNextItem(oldNextItem);
            newNextItem.setPreviousItem(this);
            super.setNextItem(newNextItem);
            return true;
        }




    }


    public boolean insertBefore(MyListItem newPreviousItem) {
//        System.out.println("set Previous item: " + (int) newPreviousItem.getValue());

        if (newPreviousItem == null) {return false;}

        MyListItem oldPreviousItem = super.getPreviousItem();
        if (oldPreviousItem == null){
            super.setPreviousItem(newPreviousItem);
            newPreviousItem.setNextItem(this);
            return true;
        }
        if (oldPreviousItem.compareTo(newPreviousItem) == 0){
            return false;
        } else {
            oldPreviousItem.setNextItem(newPreviousItem);
            newPreviousItem.setPreviousItem(oldPreviousItem);
            newPreviousItem.setNextItem(this);
            super.setPreviousItem(newPreviousItem);
            return true;
        }
    }

    @Override
    public int compareTo(MyListItem listItem) {

        if ((int) listItem.getValue() == (int) getValue()){
            return 0;
        } else if ((int) listItem.getValue() > (int) getValue()){
            return 1;
        } else {
            return -1;
        }
    }
}
