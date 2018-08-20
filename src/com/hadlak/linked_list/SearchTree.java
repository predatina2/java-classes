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
        if (newItem == null) return false;

        if (this.rootNode == null) {
            this.rootNode = newItem;
            return true;
        }

        System.out.println(" +++++ Start adding: " + newItem.getValue() + " +++++ ");

//    moveToFirst();

        boolean findAddPosition = false;
        ListItem currentItem = this.rootNode;
        while (!findAddPosition) // TODO, gehe aktuell nur rechts, nicht linke

        {
//            System.out.println("compare current: " + (int) rootNode.getValue() + " with new value");
            int compare = currentItem.compareTo(newItem);
            if (compare == 0) {
//                System.out.println("current value equals new value:");
                return false;
            } else if (compare > 0) {
                // new item is greater, move right, if possible
                if (!currentItem.hasNextItem()) {
                    // right node does not exist, add new item
                    currentItem.setNext(newItem);
//                    currentItem.setNext(newItem).setPrevious(currentItem);
//                lastNode = newItem;
//                   System.out.println("found end of the list. " + (int) newItem.getValue() + " added");
                    findAddPosition = true;
                } else {
                    // right node exists, go to that node
                    currentItem = currentItem.getNextItem();
                }
            } else {
                // new item is smaller, move left

                if (!currentItem.hasPreviousItem()) {
                    // left node does not exist, add new item
                    currentItem.setPrevious(newItem);
                    findAddPosition = true;
                } else {
                    // left node exists, go to that node
                    currentItem = currentItem.getPreviousItem();
                }

            }
        }

        return true;
    }

    @Override
    public boolean removeItem(ListItem itemToRemove) {

        if (itemToRemove != null){
            System.out.println("Deleting item: " + itemToRemove.getValue());
        } else {
            return false;
        }

        ListItem currentItem = this.rootNode;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = (currentItem.compareTo(itemToRemove));
            if (comparison > 0){
                parentItem = currentItem;
                currentItem = currentItem.getNextItem();
            } else if (comparison < 0){
                parentItem = currentItem;
                currentItem = currentItem.getPreviousItem();
            } else {
                // found item to remove
                performRemoval(currentItem, parentItem);
                return true;
            }
        }

        return false;
    }

    public void performRemoval(ListItem itemToRemove, ListItem parentItem){
        // remove item from the tree
        if (!itemToRemove.hasNextItem()){
            // no right tree, so make parent point to left tree (which may be null)
            if (parentItem.getNextItem() == itemToRemove){
                // item is right child of its parent
                parentItem.setNext(itemToRemove.getPreviousItem());
            } else if (parentItem.getPreviousItem() == itemToRemove){
                // item is left child of its parent
                parentItem.setPrevious(itemToRemove.getPreviousItem());
            } else {
                // parent must be the item to be removed, which means we are looking at the root of the tree
                this.rootNode = itemToRemove.getPreviousItem();
            }
        } else if (!itemToRemove.hasPreviousItem()){
            // no left tree, so make parent point to right tree (which may be null)
            if (parentItem.getNextItem() == itemToRemove){
                // item is right child of its parent
                parentItem.setNext(itemToRemove.getNextItem());
            } else if (parentItem.getPreviousItem() == itemToRemove){
                // item is left child of its parent
                parentItem.setPrevious(itemToRemove.getNextItem());
            } else {
                // parent must be the item to be removed, which means we are looking at the root of the tree
                this.rootNode = itemToRemove.getNextItem();
            }
        } else {
            // neither left or right are null, deletion is now complicate
            ListItem current = itemToRemove.getNextItem();
            ListItem leftMostParent = itemToRemove;
            while (current.hasPreviousItem()){
                leftMostParent = current;
                current = current.getPreviousItem();
            }
            // now put the smallest value in our node to be deleted
            itemToRemove.setValue(current.getValue());
            // and delete the smallest
            if (leftMostParent == itemToRemove) {
                // there was not leftmost node, so current points to the smallest
                // node (the one that must not be deleted)
                itemToRemove.setNext(current.getNextItem());
            } else {
                leftMostParent.setPrevious(current.getNextItem());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        // recursive method
        if (root != null) {
            traverse(root.getPreviousItem());
            System.out.println(root.getValue());
            traverse(root.getNextItem());
        }
    }
}
