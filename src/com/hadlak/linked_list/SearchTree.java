package com.hadlak.linked_list;

public class SearchTree implements NodeList {

    private ListItem rootNode = null;

    public SearchTree(ListItem rootNode) {
        this.rootNode = rootNode;
    }

    @Override
    public ListItem getRoot() {
        return this.rootNode;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if(newItem ==null)return false;

        if(this.rootNode ==null)

    {
        this.rootNode = newItem;
        this.firstNode = newItem;
        this.lastNode = newItem;
        return true;
    }

        System.out.println(" +++++ Start adding: "+newItem.getValue()+" +++++ ");

    moveToFirst();

    boolean findAddPosition = false;
        while(!findAddPosition)

    {
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

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        // recursive method
        if (root != null) {
            traverse(rootNode.getPreviousItem());
            System.out.println(rootNode.getValue());
            traverse(rootNode.getNextItem());
        }
    }
}
