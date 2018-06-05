package com.hadlak.house;

public class Bed extends Furniture {

    private int pillows;
    private int height;
    private int sheets;
    private int quilts;

    public Bed(String material, String style
            , int pillows, int height, int sheets, int quilts) {
        super("Bed", material, style);
        this.pillows = pillows;
        this.height = height;
        this.sheets = sheets;
        this.quilts = quilts;
    }

    public void make() {
        System.out.println("Bed --> Making");
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getSheets() {
        return sheets;
    }

    public int getQuilts() {
        return quilts;
    }
}
