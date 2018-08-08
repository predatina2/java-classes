package com.hadlak.linked_list;

public class MyLinkedList extends MyListItem {

    public MyLinkedList(int itsValue) {
        super(Integer.valueOf(itsValue));
    }

    public boolean addListItem(MyLinkedList newItem){


            if (newItem == null) {
                return false;
            }

            var newValue = (int) newItem.getItsValue();
            var itsValue = (int) getItsValue();
            System.out.println(itsValue);

            MyLinkedList nextItem = null;
            if (getNextListItem() != null) {
                nextItem = (MyLinkedList) getNextListItem();
            }

            MyLinkedList previousItem = null;
            if (getPreviousListItem() != null) {
                previousItem = (MyLinkedList) getPreviousListItem();
            }
        try {
            if (itsValue == newValue) {
                return false;
            }
            if (itsValue < newValue) {
                if (nextItem == null) {
                    setNextItem(newItem);
                } else if ((int) nextItem.getItsValue() > newValue) {
                    setNextItem(newItem);
                    newItem.addListItem(nextItem);
                } else {
                    nextItem.addListItem(newItem);
                }
            } else if (itsValue > newValue) {
                if (previousItem == null) {
                    setPreviousItem(newItem);
                } else if ((int) previousItem.getItsValue() < newValue) {
                    setPreviousItem(newItem);
                    newItem.addListItem(previousItem);
                } else {
                    previousItem.addListItem(newItem);
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
//        if( itsValue > newValue) {
//            if (previousItem == null){
//                setPreviousItem(newItem);
//                return true;
//            }
//            if ((int) previousItem.getItsValue() < newValue) {
//                setPreviousItem(newItem);
//                newItem.addListItem(previousItem);
//            } else {
//                previousItem.addListItem(newItem);
//            }
//        } else if (itsValue < newValue) {
//            if (nextItem == null){
//                setNextItem(newItem);
//                return true;
//            }
//            if ((int) nextItem.getItsValue() > newValue) {
//                setNextItem(newItem);
//                newItem.addListItem(nextItem);
//            } else {
//                nextItem.addListItem(newItem);
//            }
//        }
        return true;
    }

    @Override
    public void printList(){
        if (getPreviousListItem() != null)  {
            getPreviousListItem().printList();
        } else {
            System.out.print(getItsValue() + " ");
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
