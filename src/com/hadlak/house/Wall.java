package com.hadlak.house;

public class Wall {

    private String material;
    private String color;

    public Wall(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public void paintWall(String color){
        this.color = color;
        System.out.println("Wall painted in " + color);
    }

    public String getMaterial() {
        return material;
    }

    public String getColor() {
        return color;
    }
}
