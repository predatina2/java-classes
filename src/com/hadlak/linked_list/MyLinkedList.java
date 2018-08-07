package com.hadlak.linked_list;

public class MyLinkedList extends MyListItem {

    public MyLinkedList(int itsValue) {
        super(Integer.valueOf(itsValue));
    }

    public boolean addListItem(MyLinkedList newItem){
        var itsValue = (int) getItsValue();
        var newValue = (int) newItem.getItsValue();
        var nextItem = (MyLinkedList) getNextListItem();
        var previousItem = (MyLinkedList) getPreviousListItem();

        if (itsValue == newValue) {return false;}
        if( itsValue > newValue) {
            if (previousItem == null){
                setPreviousItem(newItem);
                return true;
            }
            if ((int) previousItem.getItsValue() < newValue) {
                setPreviousItem(newItem);
                newItem.addListItem(previousItem);
            } else {
                previousItem.addListItem(newItem);
            }
        } else if (itsValue < newValue) {
            if (nextItem == null){
                setNextItem(newItem);
                return true;
            }
            if ((int) nextItem.getItsValue() > newValue) {
                setNextItem(newItem);
                newItem.addListItem(nextItem);
            } else {
                nextItem.addListItem(newItem);
            }
        }
        return true;
    }

    @Override
    public void printList(){
        if (getPreviousListItem() != null)  {
            getPreviousListItem().printList();
        } else {
            System.out.println(getItsValue());
            if (getNextListItem() != null) {
                getNextListItem().printList();
            }
        }
    }

    @Override
    public Object getItsValue() {
        return super.getItsValue();
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
