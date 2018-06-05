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

//        Room emptyRoom = new Room("empty room"
//                //  , new Chair("wood", "classic")
//                //  , new Table("metal", "classic")
//                //  , new Wardrobe("wood", "romantic")
//                , new Wall("stone", 1, "north")
//                , new Wall("stone", 1, "east")
//                , new Wall("stone", 1, "south")
//                , new Wall("stone", 1, "west")
//                , new Ceiling(12, 55)
//        );
//        emptyRoom.paintWalls("purple");
//        // emptyRoom.getWardrobe().openWardrobe();
//        Bedroom bedroom = new Bedroom(emptyRoom
//                , new Bed("Iron", "Medieval", 4
//                , 1, 2, 2)
//                , new Lamp("Wood", "Modern", true
//                , 75));
//        bedroom.makeBed();
//        bedroom.getLamp().turnOn();
    }

    public void paintWalls(String color){
        wall1.paintWall(color);
        wall2.paintWall(color);
        wall3.paintWall(color);
        wall4.paintWall(color);
    }

    public String getName() {
        return name;
    }

    public Wall getWall1() {
        return wall1;
    }

    public Wall getWall2() {
        return wall2;
    }

    public Wall getWall3() {
        return wall3;
    }

    public Wall getWall4() {
        return wall4;
    }

    public Ceiling getCeiling() {
        return ceiling;
    }
}
