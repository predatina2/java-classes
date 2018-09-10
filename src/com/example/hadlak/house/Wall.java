package com.example.hadlak.house;

public class Wall {

    private String material;
    private int paintedColor;
    private String direction;

    public Wall(String material, int paintedColor, String direction) {
        this.material = material;
        this.paintedColor = paintedColor;
        this.direction = direction;
    }

    public void paintWall(int color){
        this.paintedColor = color;
        System.out.println("Wall painted in " + color);
    }

    public void paintWall(String color){
        this.paintedColor = 10; // something to do here
        System.out.println("Wall painted in " + color);
    }

    public String getMaterial() {
        return material;
    }

    public int getPaintedColor() {
        return paintedColor;
    }

    public String getDirection() {
        return direction;
    }
}
