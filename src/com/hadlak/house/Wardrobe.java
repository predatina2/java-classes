package com.hadlak.house;

public class Wardrobe extends Furniture{

    private boolean isOpen;

    public Wardrobe(String material, String style) {
        super("wardrobe", material, style);
        this.isOpen = false;
    }

    public void openWardrobe(){
        System.out.println("You want to open the wardrobe.");
        if (isOpen == true) {
            System.out.println("the wardrobe is already open.");
        } else {
            isOpen = true;
            System.out.println("you opened the wardrobe");
        }
    }
}
