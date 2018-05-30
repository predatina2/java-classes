package com.hadlak.house;

public class Room {
    private String name;

    private Chair chair;
    private Table table;
    private Wardrobe wardrobe;

    private Walls walls;

    public Room(String name, Chair chair, Table table
            , Wardrobe wardrobe, Walls walls) {
        this.name = name;

        this.chair = chair;
        this.table = table;
        this.wardrobe = wardrobe;

        this.walls = walls;

        System.out.println("Created a room with: ");
        System.out.println("a " + chair.getName() + " from "
            + chair.getMaterial());
        System.out.println("a " + table.getName() + " from "
                + table.getMaterial());
        System.out.println("a " + wardrobe.getName() + " from "
                + wardrobe.getMaterial());
        System.out.println("Walls from " + walls.getMaterial()
            + " in color " + walls.getColor());
    }

    public void paintWalls(String color){
        walls.paintWalls(color);
    }

    public Wardrobe getWardrobe() {
        return wardrobe;
    }
}
