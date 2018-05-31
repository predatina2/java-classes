package com.hadlak.house;

public class Room {
    private String name;

    private Wall wall1;
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;

    private Ceiling ceiling;

    public Room(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling) {
        this.name = name;

        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;

        this.ceiling = ceiling;

//        System.out.println("Created a room with: ");
////        System.out.println("a " + chair.getName() + " from "
////            + chair.getMaterial());
////        System.out.println("a " + table.getName() + " from "
////                + table.getMaterial());
////        System.out.println("a " + wardrobe.getName() + " from "
////                + wardrobe.getMaterial());
////        System.out.println("Walls from " + wall.getMaterial()
////            + " in color " + wall.getColor());
    }

    public void paintWalls(String color){
        wall1.paintWall(color);
        wall2.paintWall(color);
        wall3.paintWall(color);
        wall4.paintWall(color);
    }

}
