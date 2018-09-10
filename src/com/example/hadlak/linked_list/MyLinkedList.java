package com.example.hadlak.linked_list;

public class MyLinkedList implements NodeList {

    private ListItem rootNode;
    private ListItem firstNode;
    private ListItem lastNode;

    public MyLinkedList() {
    }

    @Override
    public boolean addItem(ListItem newItem) {

        if (newItem == null) return false;

        if (this.rootNode == null) {
            this.rootNode = newItem;
            this.firstNode = newItem;
            this.lastNode = newItem;
            return true;
        }

        System.out.println(" +++++ Start adding: " + newItem.getValue() + " +++++ ");

        moveToFirst();
        boolean findAddPosition = false;
        while (!findAddPosition) {
//            System.out.println("compare current: " + (int) rootNode.getValue() + " with new value");
            int compare = rootNode.compareTo(newItem);
            if (compare == 0) {
//                System.out.println("current value equals new value:");
                return false;
            } else if (compare > 0) {
//                System.out.println("current value is smaller then new value");
//                System.out.println("iterate up the list");
                if (!rootNode.hasNextItem()) {
                    rootNode.setNext(newItem).setPrevious(rootNode);
                    lastNode = newItem;
//                    System.out.println("found end of the list. " + (int) newItem.getValue() + " added");
                    findAddPosition = true;
                } else {
                    compare = rootNode.getNextItem().compareTo(newItem);
                    System.out.println("compare new value with next value: " + (int) rootNode.getNextItem().getValue());
                    if (compare < 0) {
//                        System.out.println("new value is less than next value");
//                        System.out.println("new value is added between " + (int) rootNode.getValue() + " and "
//                                + (int) rootNode.getNextItem().getValue());
                        rootNode.getNextItem().setPrevious(newItem).setNext(rootNode.getNextItem());
                        rootNode.setNext(newItem).setPrevious(rootNode);
                        findAddPosition = true;
                    } else {
                        System.out.println("new value is greater then next value. Setting current value to next value.");
                        moveToRight();
                    }
                }
            } else {
                System.out.println("current value is greater than new value");
                System.out.println("found end of the list. " + (int) newItem.getValue() + " added");
                rootNode.setPrevious(newItem).setNext(rootNode);
                firstNode = newItem;
                findAddPosition = true;
            }
        }

        return true;
    }

//    @Override
//    public boolean addItem(ListItem newItem) {
//
//        if (newItem == null) return false;
//
//        if (this.rootNode == null) {
//            this.rootNode = newItem;
//            this.firstNode = newItem;
//            this.lastNode = newItem;
//            return true;
//        }
//
//        System.out.println(" +++++ Start adding: " + newItem.getValue() + " +++++ ");
//
//        moveToFirst();
//        boolean findAddPosition = false;
//        while (!findAddPosition) {
////            System.out.println("compare current: " + (int) rootNode.getValue() + " with new value");
//            int compare = rootNode.compareTo(newItem);
//            if (compare == 0) {
//                System.out.println("current value equals new value:");
//                return false;
//            } else if (compare > 0) {
//                System.out.println("current value is smaller then new value");
//                System.out.println("iterate up the list");
//                if (!rootNode.hasNextItem()) {
//                    rootNode.setNext(newItem);
//                    lastNode = newItem;
//                    System.out.println("found end of the list. " + (int) newItem.getValue() + " added");
//                    findAddPosition = true;
//                } else {
//                    compare = rootNode.getNextItem().compareTo(newItem);
//                    System.out.println("compare new value with next value: " + (int) rootNode.getNextItem().getValue());
//                    if (compare < 0) {
//                        System.out.println("new value is less than next value");
//                        System.out.println("new value is added between " + (int) rootNode.getValue() + " and "
//                                + (int) rootNode.getNextItem().getValue());
//                        rootNode.getNextItem().setPrevious(newItem);
//                        rootNode.setNext(newItem);
//                        findAddPosition = true;
//                    } else {
//                        System.out.println("new value is greater then next value. Setting current value to next value.");
//                        moveToRight();
//                    }
//                }
//            } else {
//                System.out.println("current value is greater than new value");
//                System.out.println("found end of the list. " + (int) newItem.getValue() + " added");
//                rootNode.setPrevious(newItem);
//                firstNode = newItem;
//                findAddPosition = true;
//            }
//        }
//
//        return true;
//    }

    @Override
    public boolean removeItem(ListItem itemToRemove) {
        if (itemToRemove == null || rootNode == null) {
            return false;
        }
//TODO: last wird nicht angepasst
        moveToFirst();
        boolean foundItem = false;
        while (!foundItem) {
            int compare = rootNode.compareTo(itemToRemove);
            if (compare == 0) {
                // found item to delete
                if (rootNode == firstNode) {
                    firstNode = rootNode.getNextItem();
                    rootNode = firstNode;
                    rootNode.removePrevious();
                }
                else {
                    if (rootNode == lastNode){
                        lastNode = rootNode.getPreviousItem();
                    }
                    rootNode = rootNode.getPreviousItem();
                    rootNode.setNext(rootNode.getNextItem().getNextItem());
                }
                foundItem = true;
            } else {
                // move up to find the item or return if you can't find it
                if (!rootNode.hasNextItem() || rootNode.getNextItem().compareTo(itemToRemove) < 0) {
                    return false;
                } else {
                    moveToRight();
                }
            }
        }
        return true;
    }

    public boolean moveToLeft() {
        if (rootNode == null || !rootNode.hasValue() || !rootNode.hasPreviousItem()) {
            return false;
        } else {
            rootNode = rootNode.getPreviousItem();
            return true;
        }

    }

    public boolean moveToRight() {
        if (rootNode == null || !rootNode.hasValue() || !rootNode.hasNextItem()) {
            return false;
        } else {
            rootNode = rootNode.getNextItem();
            return true;
        }

    }

    public void moveToFirst() {
        while (rootNode.hasPreviousItem()) {
            moveToLeft();
        }
//        System.out.println("moved to first: " + rootNode.getValue());
    }

    public void moveToLast() {
        while (rootNode.hasNextItem()) {
            moveToRight();
        }
//        System.out.println("moved to last: " + rootNode.getValue());
    }


    public void printList() {
        if (rootNode == null) return;
        moveToFirst();

        System.out.print(rootNode.getValue() + " ");
        while (rootNode.hasNextItem()) {
            moveToRight();
            System.out.print((int) rootNode.getValue() + " ");
        }

    }

    @Override
    public ListItem getRoot() {
        return rootNode;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
