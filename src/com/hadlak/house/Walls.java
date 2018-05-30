package com.hadlak.house;

public class Walls {

    private String material;
    private String color;

    public Walls(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public void paintWalls(String color){
        this.color = color;
        System.out.println("Walls painted in " + color);
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
}
