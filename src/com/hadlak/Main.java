package com.hadlak;

import com.hadlak.house.*;
import com.hadlak.pc.*;

public class Main {

    public static void main(String[] args) {
        Room myRoom = new Room("living room"
                , new Chair("wood")
                , new Table("metal")
                , new Wardrobe("wood")
                , new Walls("stone", "red"));
        myRoom.paintWalls("purple");
        myRoom.getWardrobe().openWardrobe();
    }
}
