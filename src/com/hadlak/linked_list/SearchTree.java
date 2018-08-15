package com.hadlak.linked_list;

public class SearchTree implements NodeList{

    private ListItem rootNode = null;

    public SearchTree(ListItem rootNode) {
        this.rootNode = rootNode;
    }

    @Override
    public ListItem getRoot() {
        return this.rootNode;
    }

    @Override
    public boolean addItem(ListItem item) {
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        return false;
    }

    @Override
    public void traverse(ListItem root) {

    }
}
